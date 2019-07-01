package com.spring.learning.customizescanning.dao;

import com.spring.learning.customizescanning.domain.ActorDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/28 16:55
 * @since
 */
@Repository
public class ActorDao {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<ActorDO> queryAllActors() {
        String sql = "select * from Actor where test=1";
        List<ActorDO> actorDOS = jdbcTemplate.query(sql, (rs, rowNum) -> {
            System.out.println("dasd");
            ActorDO actorDO = new ActorDO();
            actorDO.setId(rs.getLong("id"));
            actorDO.setName(rs.getString("name"));
            return actorDO;
        });
        return actorDOS;
    }
}
