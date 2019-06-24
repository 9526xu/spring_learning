package com.spring.learning.customizescanning;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/21 16:36
 * @since
 */
public class CustomClassPathBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {

    public CustomClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry) {
        super(registry);

    }

    @Override
    public int scan(String... basePackages) {
        return super.scan(basePackages);
    }

    @Override
    protected boolean checkCandidate(String beanName, BeanDefinition beanDefinition) throws IllegalStateException {
        return super.checkCandidate(beanName, beanDefinition);
    }
}
