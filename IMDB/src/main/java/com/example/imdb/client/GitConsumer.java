package com.example.imdb.client;


import com.example.imdb.entity.GitUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="GitUser",url = "http://localhost:8080/github")

public interface GitConsumer {
    @GetMapping("user/{username}")
    GitUser getGitUser(@RequestParam("username") String username);

}
