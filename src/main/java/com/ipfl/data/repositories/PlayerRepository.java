package com.ipfl.data.repositories;


import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import com.ipfl.data.domains.Player;

@Repository
public interface PlayerRepository extends Neo4jRepository<Player, Long> {



}
