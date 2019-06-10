package com.spring.learning.dacelearning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/5/22 20:27
 * @since
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTemplateTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void testQueryByjdbcTemplate(){
        try {
            String sql = "select * from Actor where test=1";
            jdbcTemplate.query(sql,(rs, rowNum) -> rs.getString("name"));
        } catch (BadSqlGrammarException e) {
            e.printStackTrace();
        }
    }

}
