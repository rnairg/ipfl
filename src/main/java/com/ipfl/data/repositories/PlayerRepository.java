package com.ipfl.data.repositories;


import java.util.List;
import java.util.Optional;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ipfl.data.domains.Player;

@Repository
public interface PlayerRepository extends Neo4jRepository<Player, Long> {
	
	public <T> Optional<T> findByName(String name, Class<T> t);
	
	@Query("MATCH (n:`Player`) WHERE ID(n)={ id } WITH n RETURN n")
	public  <T> Optional<T> findById(Long id, Class<T> t);
	
	public  Optional<Player> findById(Long id);
	
	public <T> List<T> findAllProjectedBy(Class<T> t);
	
	
	/*@Query
	("match (a:Player),(b:FantasyTeam)"
			+ "where a.name={playerName} and b.name = {fteamName} "
			+ "create unique (a)-[r:PICKED_IN{FRole:{froles}}]->(b)")
	void createFRelationship(@Param("playerName") String playerName, @Param("fteamName") String fteamName, @Param("froles") List<String> froles);
	
	@Query
	("match (a:Player),(b:Match)"
			+ "where a.name={playerName} and b.name = {matchName} "
			+ "create unique (a)-[r:PLAYED_IN{Runs:{runs},Wickets:{wickets},Catches:{catches}}]->(b)")
	void createPlayerMatchRelationship(@Param("playerName") String playerName, @Param("matchName") String matchName, 
			@Param("runs") int runs, @Param("wickets") int wickets,@Param("catches") int catches);*/

	@Query
	("match (p:Player)-[{relationName}]->(Node{name:{name}}) return p")
	public <T> List<T> findByRelatedNode(@Param("name") String nodeName,@Param("relationName") String relationName);
}
