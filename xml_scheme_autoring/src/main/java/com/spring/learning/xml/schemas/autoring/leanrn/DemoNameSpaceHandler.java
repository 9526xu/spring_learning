package com.spring.learning.xml.schemas.autoring.leanrn;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/11 21:02
 * @since
 */
public class DemoNameSpaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        // elementName 为命名空间
        registerBeanDefinitionParser("application",new BeanApplicationDefinitionParser());
    }
}
