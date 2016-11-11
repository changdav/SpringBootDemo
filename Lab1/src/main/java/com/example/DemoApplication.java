package com.example;

import com.example.domain.Team;
import com.example.repository.TeamRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {
    @Autowired TeamRespository teamRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @PostConstruct
    public void init() {
        List<Team> list = new ArrayList<>();

        Team team1 = new Team();
        team1.setId(0l);
        team1.setLocation("Cali");
        team1.setMascot("Falcons");
        team1.setName("Torrey Pines");
        list.add(team1);

        Team team2 = new Team();
        team2.setId(1l);
        team2.setLocation("Washington");
        team2.setName("Generals");
        list.add(team2);
        teamRepository.save(list);
    }
}
