package com.spring.learning.xml.schemas.autoring.leanrn;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/10 21:00
 * @since
 */
public class SimpleDateFormatNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("dateformat", new SimpleDateFormatBeanDefinitionParser());
    }
}
