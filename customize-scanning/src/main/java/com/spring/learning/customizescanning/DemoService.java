package com.spring.learning.customizescanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/19 21:29
 * @since
 */
@Service
public class DemoService {

    @Autowired
    TestService testService;

    public int sub(int a, int b) {
        return a - b;
    }
}

