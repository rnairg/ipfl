package com.ipfl.data.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.ipfl.data.domains.FantasyTeam;

public interface FantasyTeamRepository extends Neo4jRepository<FantasyTeam, Long> {

}
