package com.ipfl.data.repositories;

import com.ipfl.data.domains.MatchStats;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

public interface MatchStatsRepository extends Neo4jRepository<MatchStats, Long> {

    Optional<MatchStats> findByName(String name);


}
