package com.spring.learning.customizescanning.web;

import com.spring.learning.customizescanning.domain.ActorDO;
import com.spring.learning.customizescanning.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/28 16:52
 * @since
 */
@RestController
public class ActorController {

    @Autowired
    ActorService actorService;

    @RequestMapping("/queryall")
    public List<ActorDO> queryAll() {
        return actorService.queryAll();
    }
}
