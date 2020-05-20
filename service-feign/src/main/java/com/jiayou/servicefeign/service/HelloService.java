package com.jiayou.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName : HelloService
 * @Author : jiayou
 * @Date : 2020-5-20  17:13
 * @Description :
 */
@FeignClient(value = "service-hello", fallback = SchedualServiceHiHystric.class)
public interface HelloService {
    @GetMapping("/hello")
    String hello(@RequestParam String name);
}
