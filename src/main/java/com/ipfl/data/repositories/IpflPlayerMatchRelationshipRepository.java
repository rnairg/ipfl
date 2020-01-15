package com.ipfl.data.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.ipfl.data.domains.PlayerStats;

public interface IpflPlayerMatchRelationshipRepository extends Neo4jRepository<PlayerStats, Long> {

	@Query
	("match (a:Player),(b:Match)"
			+ "where a.name = {player} and b.name = {match}"
			+ "merge (a)-[r:PLAYED_IN]->(b)"
			+ " ON MATCH SET "
			+ "r.Wickets={wickets}"
			+ ",r.Runs={runs}"
			+ ",r.Catches={catches}"
			+ ",r.Points = {points}"
			+ " ON CREATE SET "
			+ "r.Wickets={wickets}"
			+ ",r.Runs={runs}"
			+ ",r.Catches={catches}"
			+ ",r.Points = {points}"
			+ " return (r)")
	PlayerStats createByNodeNames(@Param("player") String plteam, 
			@Param("match") String match, 
			@Param("runs") int runs,
			@Param("wickets") int wickets,
			@Param("catches") int catches,
			@Param("points") int points);


}
