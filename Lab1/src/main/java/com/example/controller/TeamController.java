package com.example.controller;

import com.example.domain.Team;
import com.example.repository.TeamRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class TeamController {
    @Autowired TeamRespository teamRepository;

    @RequestMapping("/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }

    @RequestMapping("/teams/{id}")
    public Team getTeam(@PathVariable Long id) {
        return teamRepository.findOne(id);
    }
}
