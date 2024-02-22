package com.example.demoapi.web;

import com.example.demoapi.client.GitConsumer;
import com.example.demoapi.config.AppConfig;
import com.example.demoapi.dto.GitUser;
import com.example.demoapi.service.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/github")
public class GithubUserAPI {

    @Autowired
    GitService gitService;

    @Autowired
    GitConsumer gitConsumer;

    @Autowired
    AppConfig appConfig;

    @GetMapping("/user/{username}")
    public GitUser getUserDetailsFromGithub(@PathVariable String username){


        if (gitService.findByName(username).isPresent())
        {
            System.out.println("from DB");

            return gitService.findByName(username).get();


        }
        else
        {


            //url for both RestTemplate and Webclient approach
            String apiUrl = "https://api.github.com/users/" + username;

            //using RestTemplate
            //get RestTemplate object from the app config class
           /* GitUser gitUser = appConfig.getRestTemplate().getForObject("https://api.github.com/users/" + username, GitUser.class);

            */

            //using webclient

            GitUser gitUser = appConfig.getWebClient().get()
                    .uri(apiUrl)
                    .retrieve()
                    .bodyToMono(GitUser.class)
                    .block();

            //add the git user to the db

            gitService.addGitUser(gitUser);

            //Access Using FeignClient

          /*   GitUser gitUser = gitConsumer.getGitUser(username);
          */


            return gitUser;
        }




    }

}

