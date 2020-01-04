package com.ipfl.data.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.ipfl.data.domains.FRole;

public interface IpflFRelationshipRepository extends Neo4jRepository<FRole, Long> {

}
