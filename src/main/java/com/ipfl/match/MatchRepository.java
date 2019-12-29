package com.ipfl.match;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MatchRepository extends Neo4jRepository<Match, Long> {

}
