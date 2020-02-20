package com.ifpb.edu.service.impl;

import com.ifpb.edu.service.CapslockService;
import com.ifpb.edu.service.HelloService;

import static java.lang.String.format;

public class CapslockServiceImpl implements CapslockService {

    public String up(String input) {
        return input == null ? "NULL" : input.toUpperCase();
    }

}
