package com.spring.learning.customizescanning;

import com.spring.learning.customizescanning.annotation.CustomAnnotation;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/19 20:30
 * @since
 */
@CustomAnnotation(name = "test")
public class TestService {

    public int add(int a, int b) {
        return a + b;
    }
}
