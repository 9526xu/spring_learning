package com.spring.learning.dacelearning;

import com.spring.learning.dacelearning.domain.ActorDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/4/16 21:10
 * @since
 */
@Repository
public class ActorDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ActorDO> queryAllActors() {
        String sql = "select * from Actor";
        List<ActorDO> actorDOS = jdbcTemplate.query(sql, (rs, rowNum) -> {
            ActorDO actorDO = new ActorDO();
            actorDO.setId(rs.getLong("id"));
            actorDO.setName(rs.getString("name"));
            return actorDO;
        });
        return actorDOS;
    }


}
