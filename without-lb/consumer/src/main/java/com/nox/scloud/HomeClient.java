package com.nox.scloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 描述: 指定这个接口所要调用的 提供者服务名称 "service-provider"
 **/
@FeignClient("service-provider")
public interface  HomeClient {

    @GetMapping("/fine")
    String consumerFinePath();

    @GetMapping("/")
    String consumerRootPath();
}
