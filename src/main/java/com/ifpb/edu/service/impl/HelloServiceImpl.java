package com.ifpb.edu.service.impl;

import com.ifpb.edu.service.CapslockService;
import com.ifpb.edu.service.HelloService;

import static java.lang.String.format;

public class HelloServiceImpl implements HelloService {

    CapslockService cs;

    public HelloServiceImpl(CapslockService cs) {
        this.cs = cs;
    }

    public String hello(String name) {
        String resultant = format("hello, %s!", name);
        return cs.up(resultant);
    }

}