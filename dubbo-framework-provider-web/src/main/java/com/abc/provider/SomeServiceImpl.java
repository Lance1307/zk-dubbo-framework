package com.abc.provider;

import com.zk.framework.service.api.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println("执行提供者的hello()");
        return name;
    }

    @Override
    public String getHellowdng(String stline) {
        return null;
    }
}
