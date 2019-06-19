package com.spring.learning.xml.schemas.autoring.leanrn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/10 21:24
 * @since
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext.xml"})
public class XmlSchemaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(XmlSchemaApplication.class, args);
        DemoApplication demoApplication=applicationContext.getBean(DemoApplication.class);
        System.out.println("application name is "+demoApplication.getName());
    }
}
