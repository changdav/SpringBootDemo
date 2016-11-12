package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by David on 11/11/16.
 */
@Entity
public class Player {
    @Id @GeneratedValue Long id;
    String name;
    String ranking;

    public Player() {
        super();
    }

    public Player(String name, String ranking) {
        this();
        this.name = name;
        this.ranking = ranking;
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

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
}
