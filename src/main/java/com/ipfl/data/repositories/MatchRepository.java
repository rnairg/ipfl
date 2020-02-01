package com.ipfl.data.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import com.ipfl.data.domains.Match;

public interface MatchRepository extends Neo4jRepository<Match, Long> {
	
	public Optional<Match> findByName(String name);
	
	public <T> Optional<T> findByName(String name, Class<T> t);
	
	public <T> Optional<T> findById(Long id, Class<T> t);
	
	public <T> List<T> findAllProjectedBy(Class<T> t);
	
	@Query
	("match (m:Match)-[{relationName}]->(Node{name:{nodeName}}) return n")
	public <T> List<T> findByRelatedNode(@Param("nodeName") String nodeName,@Param("relationName") String relationName);

}
