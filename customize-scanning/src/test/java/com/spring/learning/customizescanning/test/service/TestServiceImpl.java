package com.spring.learning.customizescanning.test.service;

import com.spring.learning.customizescanning.test.annotation.TestAnnotation;
import org.springframework.stereotype.Service;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/25 18:32
 * @since
 */
@Service
@TestAnnotation
public class TestServiceImpl implements TestService {

    public String test() {
        return "test";
    }
}
