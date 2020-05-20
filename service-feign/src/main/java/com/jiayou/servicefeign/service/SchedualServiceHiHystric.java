package com.jiayou.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName : SchedualServiceHiHystric
 * @Author : jiayou
 * @Date : 2020-5-20  17:22
 * @Description :
 */
@Component
public class SchedualServiceHiHystric implements HelloService{
    @Override
    public String hello(String name) {
        String str = "service have some problem, please retry later...";
        return str;
    }
}
