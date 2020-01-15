package com.ipfl.data.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.ipfl.data.domains.PLRole;


public interface IpflPLRelationshipRepository extends Neo4jRepository<PLRole, Long> {
	
	@Query
	("match (a:Player),(b:PLTeam)"
			+ "where a.name = {player} and b.name = {plteam}"
			+ "merge (a)-[r:PLAYS_FOR]->(b)"
			+ "ON MATCH SET r.PLRole={plroles}"
			+ ",r.StartDate={startDate}"
			+ ",r.EndDate={endDate}"
			+ "ON CREATE SET r.PLRole={plroles}"
			+ ",r.StartDate={startDate}"
			+ ",r.EndDate={endDate}"
			+ "return (r)")
	PLRole createByNodeNames(@Param("player") String player, 
			@Param("plteam") String plteam, 
			@Param("plroles") List<String> plroles,
			@Param("startDate") Date startDate,
			@Param("endDate") Date endDate);

}
