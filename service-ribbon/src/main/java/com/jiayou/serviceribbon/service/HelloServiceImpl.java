package com.jiayou.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName : HelloServiceImpl
 * @Author : jiayou
 * @Date : 2020-5-20  16:59
 * @Description :
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    @Override
    public String hello(String name) {
        return restTemplate.getForEntity("http://service-hello/hello?name=" + name, String.class).getBody();
    }
    public String fallback(String name){
        String str = "service have some problem, please retry later...";
        return str;
    }
}
