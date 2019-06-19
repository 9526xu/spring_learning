package com.spring.learning;

import lombok.Data;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        Person person=new Person();
        person.setAge("11");
        person.setName("test");

        List<String> strings=new ArrayList<>();
        if(!strings.isEmpty())


        assertTrue(true);
    }



    @Data
    public static class Person {
        private String name;
        private String age;
    }
}
