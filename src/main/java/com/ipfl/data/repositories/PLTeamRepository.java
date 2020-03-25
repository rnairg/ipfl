package com.ipfl.data.repositories;



import java.util.List;
import java.util.Optional;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import com.ipfl.data.domains.PLTeam;

public interface PLTeamRepository extends Neo4jRepository<PLTeam, Long> {
	
	Optional<PLTeam> findByName(String name, Class<PLTeam> t);
	
	Optional<PLTeam> findById(Long id, Class<PLTeam> t);
	
	List<PLTeam> findAllProjectedBy(Class<PLTeam> t);
	
	@Query
	("match (p:Player{name:{nodeName})-[{relationName}]->(Node)}) return p")
	List<PLTeam> findByRelatedNode(@Param("nodeName") String nodeName,@Param("relationName") String relationName);
	
	/*@Query
	("match (a:PLTeam),(b:Match)"
			+ "where a.name={plteamName} and b.name = {matchName} "
			+ "create unique (a)-[r:PLAYED{Runs:{runs},Wickets:{wickets},Overs:{overs}}]->(b)")
	void createMatchRelationship(@Param("plteamName") String plteamName, @Param("matchName") String matchName, 
			@Param("runs") int runs, @Param("wickets") int wickets,@Param("overs") float overs);*/
	
	
	
	
	
}
