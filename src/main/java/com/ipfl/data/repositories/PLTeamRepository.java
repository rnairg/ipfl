package com.ipfl.data.repositories;


import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.ipfl.data.domains.PLTeam;

public interface PLTeamRepository extends Neo4jRepository<PLTeam, Long> {}
