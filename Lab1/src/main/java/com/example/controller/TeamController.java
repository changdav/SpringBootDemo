package com.example.controller;

import com.example.domain.Team;
import com.example.repository.TeamRespository;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by David on 11/11/16.
 */
@RestController
public class TeamController {
    @Autowired TeamRespository teamRepository;

    @RequestMapping("/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }
}
