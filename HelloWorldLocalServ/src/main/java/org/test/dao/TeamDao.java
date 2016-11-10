package org.test.dao;

import org.springframework.data.repository.CrudRepository;
import org.test.domain.Team;
import java.util.List;

public interface TeamDao extends CrudRepository<Team, Long> {
    List<Team> findAll();
    Team findByName(String name);
}
