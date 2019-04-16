package com.spring.learning.dacelearning;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/4/11 21:08
 * @since SQL 异常返回码测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SQLExceptrionTest {

    @Autowired
    DataSource dataSource;

    QueryRunner queryRunner;

    @Before
    public void buildDataSource() {
        queryRunner = new QueryRunner(dataSource);
    }


    @Test(expected = SQLException.class)
    public void testWhenSqlError() throws SQLException {
        String sql="select * from1 test";
        queryRunner.execute(sql);
    }
}
