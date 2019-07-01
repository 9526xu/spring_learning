package com.spring.learning.customizescanning.service;

import com.spring.learning.customizescanning.dao.ActorDao;
import com.spring.learning.customizescanning.domain.ActorDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/28 16:54
 * @since
 */
@Service
public class ActorService {

   @Autowired
    ActorDao actorDao;

   public List<ActorDO> queryAll() {
       return actorDao.queryAllActors();
   }

}
