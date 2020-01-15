package com.ipfl.data.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.ipfl.data.domains.MatchStats;


public interface IpflPLTeamMatchRelationshipRepository extends Neo4jRepository<MatchStats, Long> {
	
	@Query
	("match (a:PLTeam),(b:Match)"
			+ "where a.name = {plteam} and b.name = {match}"
			+ "merge (a)-[r:PLAYED]->(b)"
			+ "ON MATCH SET"
			+ "r.Wickets={wickets}"
			+ ",r.Runs={runs}"
			+ ",r.Overs={overs}"
			+ "ON CREATE SET"
			+ "r.Wickets={wickets}"
			+ ",r.Runs={runs}"
			+ ",r.Overs={overs}"
			+ "return (r)")
	MatchStats createByNodeNames(@Param("plteam") String plteam, 
			@Param("match") String match, 
			@Param("wickets") int wickets,
			@Param("runs") int runs,
			@Param("overs") float overs);

}
