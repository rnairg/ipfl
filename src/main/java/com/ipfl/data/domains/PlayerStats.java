package com.ipfl.data.domains;

//import org.neo4j.ogm.annotation.EndNode;
//import org.neo4j.ogm.annotation.GeneratedValue;
//import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.RelationshipEntity;
//import org.neo4j.ogm.annotation.StartNode;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;



public class PlayerStats extends Node {
	
	/*--------------Member Variables----------*/

	@Relationship(type="RELATES_TO")
	private Player player;

	@Relationship(type="GENERATED", direction=Relationship.INCOMING)
	private Match match;
	
	@Property(name = "Runs")
	private int runs;
	
	@Property(name = "Wickets")
	private int wickets;
	
	@Property(name = "Catches")
	private int catches;
	
	@Property(name = "Points")
	private int points;

	/*--------------Constructors----------*/
	
	public PlayerStats() {}
	
	@JsonCreator
	public PlayerStats(@JsonProperty("Player") Player player, @JsonProperty("Match") Match match, int runs, int wickets, int catches) {
		this.runs = runs;
		this.wickets = wickets;
		this.catches = catches;
	}
	
	public PlayerStats(@JsonProperty("Player") Player player, @JsonProperty("Match") Match match,int runs, int wickets, int catches, int points) {
		this.runs = runs;
		this.wickets = wickets;
		this.catches = catches;
		this.points = points;
	}

	/*--------------Getters----------*/


	public int getRuns() {
		return runs;
	}

	public int getWickets() {
		return wickets;
	}


	public int getCatches() {
		return catches;
	}

	public int getPoints() {
		return points;
	}
	
	/*--------------Setters----------*/
	
	public void setPoints(int points) {
		this.points = points;
	}

}
