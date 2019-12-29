package com.ipfl.data.repositories;



import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.ipfl.data.domains.PLTeam;

public interface PLTeamRepository extends Neo4jRepository<PLTeam, Long> {
	
	@Query
	("match (a:PLTeam),(b:Match)"
			+ "where a.name={plteamName} and b.name = {matchName} "
			+ "create unique (a)-[r:PLAYED{Runs:{runs},Wickets:{wickets},Overs:{overs}}]->(b)")
	void createMatchRelationship(@Param("plteamName") String plteamName, @Param("matchName") String matchName, 
			@Param("runs") int runs, @Param("wickets") int wickets,@Param("overs") float overs);
	
	
	
}
