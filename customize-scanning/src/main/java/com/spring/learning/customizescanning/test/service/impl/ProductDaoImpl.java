package com.spring.learning.customizescanning.test.service.impl;

import org.springframework.stereotype.Repository;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/27 20:35
 * @since
 */
@Repository
public class ProductDaoImpl {

    public void queryMock() {
        throw new IllegalStateException("state is error");
    }
}
