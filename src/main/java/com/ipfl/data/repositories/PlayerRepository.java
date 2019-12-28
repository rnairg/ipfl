package com.ipfl.data.repositories;


import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ipfl.data.domains.Player;

@Repository
public interface PlayerRepository extends Neo4jRepository<Player, Long> {

	@Query
	("match (a:Player),(b:PLTeam)"
			+ "where a.name={playerName} and b.name = {plteamName} "
			+ "create unique (a)-[r:PLAYS_FOR{PLRole:{plroles}}]->(b)")
	void createPLRelationship(@Param("playerName") String playerName, @Param("plteamName") String plteamName, @Param("plroles") List<String> plroles);

}
