package org.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.test.dao.TeamDao;
import org.test.domain.Player;
import org.test.domain.Team;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer {

	/**
	 * Use when specified as JAR
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootApplication.class, args);
	}

	/**
	 * Use when specified as WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroservicesBootApplication.class);
	}

	@PostConstruct
	public void init() {
		Set<Player> players= new HashSet<>();
		players.add(new Player("Charlie", "Pitcher"));
		players.add(new Player("Snoopy", "Shortstop"));

		Team team = new Team("California", "Peanuts", players);
		teamDao.save(team);
	}

	@Autowired TeamDao teamDao;
}
