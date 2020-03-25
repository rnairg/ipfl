package com.ipfl.data.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import com.ipfl.data.domains.Match;

public interface MatchRepository extends Neo4jRepository<Match, Long> {
	
	Optional<Match> findByName(String name);
	
	Optional<Match> findByName(String name, Class<Match> t);
	
	Optional<Match> findById(Long id, Class<Match> t);
	
	List<Match> findAllProjectedBy(Class<Match> t);
	
	@Query
	("match (m:Match)-[{relationName}]->(Node{name:{nodeName}}) return n")
	 List<Match> findByRelatedNode(@Param("nodeName") String nodeName,@Param("relationName") String relationName);

}
