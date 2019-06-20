package com.spring.learning.customizescanning;

import com.spring.learning.customizescanning.annotation.CustomAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ="com.spring.learning.customizescanning",includeFilters =@ComponentScan.Filter(CustomAnnotation.class))
@SpringBootApplication
public class CustomizeScanningApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(CustomizeScanningApplication.class, args);
        TestService testService = applicationContext.getBean(TestService.class);
        System.out.println(testService.add(1, 2));
    }

}
