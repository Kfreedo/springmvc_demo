package com.mars.demo.service;

import com.mars.framework.annotation.MarsService;

/**
 * @author mars
 * @since 2019/11/6 12:42
 */
@MarsService
public class DemoServiceImpl implements DemoService {
    public String get(String name) {
        return String.format("My name is %s.", name);
    }
}
