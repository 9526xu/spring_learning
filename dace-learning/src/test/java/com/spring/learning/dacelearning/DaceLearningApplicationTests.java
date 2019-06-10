package com.spring.learning.dacelearning;

import com.spring.learning.dacelearning.domain.ActorDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaceLearningApplicationTests {

    @Autowired
    ActorDao actorDao;

    @Test
    public void contextLoads() {
        List<ActorDO> actorDOS= null;
        try {
            actorDOS = actorDao.queryAllActors();

        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertTrue(!CollectionUtils.isEmpty(actorDOS));
    }

}
