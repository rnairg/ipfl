package com.ipfl.fantasyTeam;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface FantasyTeamRepository extends Neo4jRepository<FantasyTeam, Long> {

}
