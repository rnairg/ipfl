package com.ipfl.data.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.ipfl.data.domains.FRole;

public interface IpflFRelationshipRepository extends Neo4jRepository<FRole, Long> {
	
	@Query
	("match (a:Player),(b:FTeam)"
			+ "where a.name = {player} and b.name = {fteam}"
			+ "merge (a)-[r:PLAYS_FOR]->(b)"
			+ "ON MATCH SET r.FRole={froles}"
			+ ",r.StartDate={startDate}"
			+ ",r.EndDate={endDate}"
			+ "ON CREATE SET r.FRole={froles}"
			+ ",r.StartDate={startDate}"
			+ ",r.EndDate={endDate}"
			+ "return (r)")
	FRole createByNodeNames(@Param("player") String player, 
			@Param("fteam") String fteam, 
			@Param("froles") List<String> froles,
			@Param("startDate") Date startDate,
			@Param("endDate") Date endDate);

}
