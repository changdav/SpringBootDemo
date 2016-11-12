package com.example.repository;

import com.example.domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by David on 11/12/16.
 */
@RestResource(path = "players", rel = "player")
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
