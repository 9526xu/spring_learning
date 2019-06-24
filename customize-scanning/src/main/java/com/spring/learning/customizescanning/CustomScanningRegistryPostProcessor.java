package com.spring.learning.customizescanning;

import com.spring.learning.customizescanning.annotation.CustomService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import java.util.Set;



/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/21 13:46
 * @since
 */
@Component
public class CustomScanningRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {


    /**
     *
     * beanDefinition 加载完成之后，Bean 加载之前
     *
     * @param registry
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        CustomClassPathBeanDefinitionScanner customClassPathBeanDefinitionScanner=new CustomClassPathBeanDefinitionScanner(registry);
        customClassPathBeanDefinitionScanner.addIncludeFilter(new AnnotationTypeFilter(CustomService.class));
        //customClassPathBeanDefinitionScanner.scan("com.spring.learning.customizescanning.service");

        Set<BeanDefinition> beanDefinitionSet = customClassPathBeanDefinitionScanner.findCandidateComponents("com.spring.learning.customizescanning.service");

        for (BeanDefinition beanDefinition : beanDefinitionSet) {

            Class<?> beanClass = ClassUtils.resolveClassName(beanDefinition.getBeanClassName(),CustomScanningRegistryPostProcessor.class.getClassLoader());

            CustomService service = AnnotationUtils.findAnnotation(beanClass, CustomService.class);
            beanDefinition.getPropertyValues().add("name",service.name());
            beanDefinition.getPropertyValues().add("interfaceClass",service.interfaceClass());
            registry.registerBeanDefinition("test",beanDefinition);
        }

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
