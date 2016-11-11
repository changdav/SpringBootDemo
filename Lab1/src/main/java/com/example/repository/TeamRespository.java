package com.example.repository;

import com.example.domain.Team;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by David on 11/11/16.
 */
public interface TeamRespository extends CrudRepository<Team, Long> {
}
