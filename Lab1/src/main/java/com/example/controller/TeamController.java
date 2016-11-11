package com.example.controller;

import com.example.domain.Team;
import com.sun.tools.javac.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by David on 11/11/16.
 */
@RestController
public class TeamController {
    @RequestMapping("/teams")
    public ArrayList<Team> getTeams() {
        ArrayList<Team> teamlist = new ArrayList<>();

        Team team1 = new Team();
        team1.setId(0l);
        team1.setLocation("Cali");
        team1.setMascot("Falcons");
        team1.setName("Torrey Pines");
        teamlist.add(team1);

        Team team2 = new Team();
        team2.setId(1l);
        team2.setLocation("Washington");
        team2.setName("Generals");
        teamlist.add(team2);

        return teamlist;
    };

}
