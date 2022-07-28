package com.springboot.tutorial.springjenkinsintegration.api;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public void testClass() {
        System.out.println("service called...");
        System.out.printl("Again next test commit previous not build!!!");
    }
}
