package org.test.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.test.domain.Player;

@RestResource(path = "players", rel = "players")
public interface PlayerDao extends CrudRepository<Player, Long> {
}