package com.nox.scloud.eurekapolice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by LiuLi on 2018/5/17.
 */
@EnableEurekaClient
@SpringBootApplication
public class PoliceApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PoliceApp.class).web(true).run(args);
    }

}

