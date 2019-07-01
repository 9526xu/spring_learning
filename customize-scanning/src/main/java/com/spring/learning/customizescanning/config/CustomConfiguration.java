package com.spring.learning.customizescanning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/27 20:41
 * @since
 */
@Configuration
public class CustomConfiguration {

    @Bean
    public PersistenceExceptionTranslationPostProcessor  translationPostProcessor() {
        return new PersistenceExceptionTranslationPostProcessor();
    }
}
