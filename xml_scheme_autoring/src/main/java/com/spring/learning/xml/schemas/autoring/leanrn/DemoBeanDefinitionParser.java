package com.spring.learning.xml.schemas.autoring.leanrn;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/11 20:48
 * @since
 */
public class DemoBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    /**
     * 返回最会需要注入 Spring Bean 的类型
     * @param element
     * @return
     */
    @Override
    protected Class<?> getBeanClass(Element element) {
        return DemoApplication.class;
    }

    /***
     * 这个方法完成真正解析动作
     * @param element
     * @param builder
     */
    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String name=element.getAttribute("name");
        builder.addPropertyValue("name",name);
    }
}
