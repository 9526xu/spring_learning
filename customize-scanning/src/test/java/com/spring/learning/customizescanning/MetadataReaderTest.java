package com.spring.learning.customizescanning;

import com.spring.learning.customizescanning.test.annotation.TestAnnotation;
import com.spring.learning.customizescanning.test.service.TestService;
import com.spring.learning.customizescanning.test.service.TestServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/25 18:28
 * @since
 */
public class MetadataReaderTest {

    public MetadataReaderFactory metadataReaderFactory;

    @Before
    public void setUp() {
        metadataReaderFactory = new CachingMetadataReaderFactory();
    }

    @Test
    public void getMetadataReaderTest() throws IOException {
        MetadataReader metadataReader = metadataReaderFactory.getMetadataReader(TestServiceImpl.class.getName());
        Assert.assertNotNull(metadataReader.getClassMetadata());
        Assert.assertNotNull(metadataReader.getAnnotationMetadata());
        Assert.assertNotNull(metadataReader.getResource());
    }

    @Test
    public void classMetadataTest() throws IOException {
        MetadataReader metadataReader = metadataReaderFactory.getMetadataReader(TestServiceImpl.class.getName());
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        Assert.assertEquals(classMetadata.getClassName(),TestServiceImpl.class.getName());
        Assert.assertEquals(classMetadata.getInterfaceNames()[0], TestService.class.getName());
    }

    /**
     * 结构
     * TestAnnotation
     *      Component
     *         Documented
     * @throws IOException
     */
    @Test
    public void annotationMetadataTest() throws IOException {
        MetadataReader metadataReader = metadataReaderFactory.getMetadataReader(TestServiceImpl.class.getName());
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        Assert.assertEquals(true,annotationMetadata.hasAnnotation(TestAnnotation.class.getName()));
        Assert.assertEquals(true,annotationMetadata.hasMetaAnnotation(Component.class.getName()));
        Assert.assertEquals(annotationMetadata.getAnnotationTypes().contains(TestAnnotation.class.getName()),true);
        Assert.assertEquals(1,annotationMetadata.getMetaAnnotationTypes(TestAnnotation.class.getName()).size());
        annotationMetadata.getAllAnnotationAttributes(TestAnnotation.class.getName());
//        annotationMetadata.getAllAnnotationAttributes()
    }


}
