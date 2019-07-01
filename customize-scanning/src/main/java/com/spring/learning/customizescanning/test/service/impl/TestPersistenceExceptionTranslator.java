package com.spring.learning.customizescanning.test.service.impl;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.stereotype.Component;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/27 20:47
 * @since
 */
@Component
public class TestPersistenceExceptionTranslator implements PersistenceExceptionTranslator {

    @Override
    public DataAccessException translateExceptionIfPossible(RuntimeException ex) {
        if (ex instanceof IllegalStateException) {
            return new DuplicateKeyException("error");
        }
        return null;
    }
}
