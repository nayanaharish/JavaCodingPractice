package com.example.demoapi.client;

import com.example.demoapi.dto.GitUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="GitUser" ,url ="https://api.github.com")

public interface GitConsumer {

    @GetMapping("users/{username}")
    GitUser getGitUser(@RequestParam("username") String username);
}
