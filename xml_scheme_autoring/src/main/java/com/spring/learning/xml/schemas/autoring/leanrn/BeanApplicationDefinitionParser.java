package com.spring.learning.xml.schemas.autoring.leanrn;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/15 19:13
 * @since
 */
public class BeanApplicationDefinitionParser implements BeanDefinitionParser {


    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        String name=element.getAttribute("name");
        // Bean 定义，最后根据这个生产 Bean
        RootBeanDefinition rootBeanDefinition=new RootBeanDefinition();
        rootBeanDefinition.setBeanClass(DemoApplication.class);
        rootBeanDefinition.setLazyInit(false);
        // 添加解析的属性
        rootBeanDefinition.getPropertyValues().add("name",name);
        // 将生成的 BeanDefinition 注册，少了这一步将会导致最后生成 Bean 时报错
        parserContext.getRegistry().registerBeanDefinition("application",rootBeanDefinition);
        return rootBeanDefinition;
    }
}
