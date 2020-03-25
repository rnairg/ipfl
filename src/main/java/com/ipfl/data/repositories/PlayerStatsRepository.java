package com.ipfl.data.repositories;

import com.ipfl.data.domains.PlayerStats;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PlayerStatsRepository extends Neo4jRepository<PlayerStats, Long> {
}
