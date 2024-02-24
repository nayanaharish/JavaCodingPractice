package com.example.microservicesdemoappserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServicesDemoAppServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServicesDemoAppServiceRegistryApplication.class, args);
    }

}
