package com.spring.learning.customizescanning.test.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/25 19:20
 * @since
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SuperAnnotation
@Component
public @interface TestAnnotation {
    String name() default "";

}
