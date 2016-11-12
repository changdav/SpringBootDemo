package com.example;

import com.example.domain.Player;
import com.example.domain.Team;
import com.example.repository.TeamRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoApplication {
    @Autowired TeamRespository teamRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @PostConstruct
    public void init() {
        List<Team> list = new ArrayList<>();

        HashSet<Player> playerSet = new HashSet<>();
        playerSet.add(new Player("Big Easy", "Showman"));
        playerSet.add(new Player("Buckets", "Guard"));
        playerSet.add(new Player("Dizzy", "Guard"));
        list.add(new Team("Torrey Pines", "California", "Falcons", playerSet));

        HashSet<Player> playerSet1 = new HashSet<>();
        playerSet1.add(new Player("Eazy-E", "N"));
        playerSet1.add(new Player("MC Ren", "W"));
        playerSet1.add(new Player("Dr. Dre", "A"));
        list.add(new Team("NWA", "Compton", "Hip Hop", playerSet1));

        teamRepository.save(list);
    }
}
