package com.ipfl.data.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.ipfl.data.domains.Match;

public interface MatchRepository extends Neo4jRepository<Match, Long> {

}
