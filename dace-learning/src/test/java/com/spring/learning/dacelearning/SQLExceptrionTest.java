package com.spring.learning.dacelearning;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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


    @Test()
    public void testWhenSqlError() throws SQLException {
        String sql = "select * from tb_sms_chnl";
        queryRunner.query(sql, rs -> {

            System.out.println(rs);
            return "";
        });
    }

    @Test
    public void testSQLErrorWithJdbc() throws SQLException {
        try {
            Connection connection = dataSource.getConnection();
            Statement stmt = connection.createStatement();

            String sql = "select * from Actor where test=1";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void testJdbc() throws SQLException {
        try {
            // 这里简化数据库连接方式
            Connection connection = dataSource.getConnection();

            Statement stmt = connection.createStatement();

            String sql = "select * from Actor where  test='1'";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            if(e.getErrorCode()==42122){
                System.out.println("sql 语句错误");
            }else{
                e.printStackTrace();
            }
        }

    }
}
