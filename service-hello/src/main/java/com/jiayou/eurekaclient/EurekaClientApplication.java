package com.jiayou.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String hello(String name){
        String str = "hello ~ " + name + " ,i am " + port;
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
