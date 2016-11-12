package com.example.repository;

import com.example.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by David on 11/11/16.
 */
@RestResource(path = "teams", rel = "team")
public interface TeamRespository extends CrudRepository<Team, Long> {
}
