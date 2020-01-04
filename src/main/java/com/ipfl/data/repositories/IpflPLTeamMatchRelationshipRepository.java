package com.ipfl.data.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.ipfl.data.domains.MatchStats;

public interface IpflPLTeamMatchRelationshipRepository extends Neo4jRepository<MatchStats, Long> {

}
