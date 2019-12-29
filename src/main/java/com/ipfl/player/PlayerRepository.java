package com.ipfl.player;


import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends Neo4jRepository<Player, Long> {

	@Query
	("match (a:Player),(b:PLTeam)"
			+ "where a.name={playerName} and b.name = {plteamName} "
			+ "create unique (a)-[r:PLAYS_FOR{PLRole:{plroles}}]->(b)")
	void createPLRelationship(@Param("playerName") String playerName, @Param("plteamName") String plteamName, @Param("plroles") List<String> plroles);
	
	@Query
	("match (a:Player),(b:FantasyTeam)"
			+ "where a.name={playerName} and b.name = {fteamName} "
			+ "create unique (a)-[r:PICKED_IN{FRole:{froles}}]->(b)")
	void createFRelationship(@Param("playerName") String playerName, @Param("fteamName") String fteamName, @Param("froles") List<String> froles);
	
	@Query
	("match (a:Player),(b:Match)"
			+ "where a.name={playerName} and b.name = {matchName} "
			+ "create unique (a)-[r:PLAYED_IN{Runs:{runs},Wickets:{wickets},Catches:{catches}}]->(b)")
	void createPlayerMatchRelationship(@Param("playerName") String playerName, @Param("matchName") String matchName, 
			@Param("runs") int runs, @Param("wickets") int wickets,@Param("catches") int catches);

}
