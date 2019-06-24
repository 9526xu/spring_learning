package com.spring.learning.customizescanning.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/20 17:27
 * @since
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CustomService {

    String name() default "";

    Class<?> interfaceClass() default void.class;


}
