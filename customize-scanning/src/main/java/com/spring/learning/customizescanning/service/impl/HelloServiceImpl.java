package com.spring.learning.customizescanning.service.impl;

import com.spring.learning.customizescanning.annotation.CustomService;
import com.spring.learning.customizescanning.service.IHelloService;
import lombok.Data;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/20 17:26
 * @since
 */
@Data
@CustomService(name = "helloService",interfaceClass = IHelloService.class)
public class HelloServiceImpl implements IHelloService {

    private String name;

    private Class interfaceClass;

    @Override
    public String hello() {
        return "hello world";
    }
}
