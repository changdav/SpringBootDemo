package org.test.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.test.domain.Team;
import java.util.List;

@RestResource(path = "teams", rel = "teams")
public interface TeamDao extends CrudRepository<Team, Long> {
    List<Team> findAll();
    Team findByName(String name);
}