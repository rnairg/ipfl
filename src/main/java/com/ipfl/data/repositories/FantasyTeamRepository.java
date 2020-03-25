package com.ipfl.data.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import com.ipfl.data.domains.FantasyTeam;


public interface FantasyTeamRepository extends Neo4jRepository<FantasyTeam, Long> {
	
	Optional<FantasyTeam> findByName(String name, Class<FantasyTeam> t);
	
	Optional<FantasyTeam> findById(Long id, Class<FantasyTeam> t);
	
	List<FantasyTeam> findAllProjectedBy(Class<FantasyTeam> t);
	
	@Query
	("match (Player{name:{nodeName}})-[{relationName}]->(f:FantasyTeam) return f")
	List<FantasyTeam> findByRelatedNode(@Param("nodeName") String nodeName, @Param("relationName") String relationName);
	
}
