package com.nox.scloud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    private HomeClient homeClient;

    @GetMapping(value = "/hello")
    public String hello() {
        return homeClient.consumerRootPath();
    }

    @GetMapping(value = "/fine")
    public String hello2() {
        return homeClient.consumerFinePath();
    }

}
