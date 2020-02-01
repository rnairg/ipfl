package com.ipfl.data.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import com.ipfl.data.domains.FantasyTeam;


public interface FantasyTeamRepository extends Neo4jRepository<FantasyTeam, Long> {
	
	public <T> Optional<T> findByName(String name, Class<T> t);
	
	public <T> Optional<T> findById(Long id, Class<T> t);
	
	public <T> List<T> findAllProjectedBy(Class<T> t);
	
	@Query
	("match (Player{name:{nodeName}})-[{relationName}]->(f:FantasyTeam) return f")
	public <T> List<T> findByRelatedNode(@Param("nodeName") String nodeName, @Param("relationName") String relationName);
	
}
