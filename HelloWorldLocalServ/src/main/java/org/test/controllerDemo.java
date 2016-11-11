package org.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.dao.TeamDao;
import org.test.domain.Team;

@RestController
public class controllerDemo {

    @Autowired TeamDao teamDao;

    @RequestMapping("/hi/{name}")
    public Team hiThere(@PathVariable String name) {
        return teamDao.findByName(name);
    }
}
