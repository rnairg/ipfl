package com.ipfl.data.domains;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("player")
@RelationshipEntity (type = "PLAYED_IN")
public class PlayerStats {
	
	/*--------------Member Variables----------*/
	
	@Id @GeneratedValue
	Long id;
	
	@StartNode
	private Player player;
	
	@EndNode
	private Match match;
	
	@Property(name = "Runs")
	private int runs;
	
	@Property(name = "Wickets")
	private int wickets;
	
	@Property(name = "Catches")
	private int catches;

	
	
	/*--------------Constructors----------*/
	
	public PlayerStats() {}
	
	
	/*--------------Getters----------*/

	
	public Long getId() {
		return id;
	}



	public Player getPlayer() {
		return player;
	}



	public Match getMatch() {
		return match;
	}



	public int getRuns() {
		return runs;
	}



	public int getWickets() {
		return wickets;
	}



	public int getCatches() {
		return catches;
	}

}
