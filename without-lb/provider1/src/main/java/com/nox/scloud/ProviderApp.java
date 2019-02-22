package com.nox.scloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiuLi on 2018/5/17.
 */

@RestController
@EnableEurekaClient
@SpringBootApplication
public class ProviderApp {

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home() {
        return "This is / function, Hello my world, port:" + port;
    }

    @RequestMapping("/fine")
    public String fine() {
        return "This is /fine function, Hello my world, port:" + port;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderApp.class).web(true).run(args);
    }

}

