package com.nox.scloud.eurekaperson.controllers;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by LiuLi on 2018/5/17.
 */

@RestController
@Configuration
public class PersonController {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping(value = "/person", method= RequestMethod.GET)
    public @ResponseBody
    String remoteCall() {
        RestTemplate tpl = getRestTemplate();
        String s = tpl.getForObject("http://policeCenter/a",String.class );
        s += "aaaaaaaaaaaaaa  ------   ";
        return s;
    }

}
