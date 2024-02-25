package com.example.client2.service1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="CLIENT-ONE")
public interface WelcomeApi {

    @GetMapping("/welcome")
    public String welcomeMessage();
}
