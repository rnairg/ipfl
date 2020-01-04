package com.ipfl.data.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.ipfl.data.domains.PlayerStats;

public interface IpflPlayerMatchRelationshipRepository extends Neo4jRepository<PlayerStats, Long> {

}
