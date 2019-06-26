package com.spring.learning.customizescanning.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/25 19:40
 * @since
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SuperAnnotation {
    int age() default 1;

    String superName() default "test";

    boolean isTest() default false;
}
