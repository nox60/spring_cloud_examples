package com.nox.scloud.configserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerApp.class).run(args);
   //     SpringApplication.run(ConfigServerApplication.class, args);

    }

}


