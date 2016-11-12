package com.example.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by David on 11/11/16.
 */
@Entity
public class Team {
    @Id @GeneratedValue Long id;
    String name;
    String location;
    String mascot;
    @OneToMany(cascade = CascadeType.ALL) @JoinColumn(name = "teamId")
    Set<Player> players;

    public Team() {
        super();
    }

    public Team(String name, String location, String mascot, Set<Player> players) {
        this();
        this.name = name;
        this.location = location;
        this.mascot = mascot;
        this.players = players;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
