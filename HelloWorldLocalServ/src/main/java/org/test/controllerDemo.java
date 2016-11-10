package org.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.test.domain.Player;
import org.test.domain.Team;

import javax.annotation.PostConstruct;
import java.util.*;

@Controller
public class controllerDemo {

    private Team team;

    @PostConstruct
    public void init() {
        Set<Player> players= new HashSet<>();
        players.add(new Player("Charlie", "Pitcher"));
        players.add(new Player("Snoopy", "Shortstop"));

        team = new Team("Peanuts", "California", players);
    }

    @RequestMapping("/hi")
    public @ResponseBody Team hiThere() {
        return team;
    }
}
