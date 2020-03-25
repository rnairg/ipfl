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

public class MatchStats extends Node{
	
	/*--------------Member Variables----------*/

	@Relationship(type = "GENERATED", direction = Relationship.INCOMING)
	private Match match;

	@Relationship(type="RELATES_TO")
	private PLTeam plteam;

	@Property(name = "Runs")
	private int runs;
	
	@Property(name = "Wickets")
	private int wickets;
	
	@Property(name = "Overs")
	private float overs;
	
	
	/*--------------Constructors----------*/

	public MatchStats() {}
	
	@JsonCreator
	public MatchStats(int runs, int wickets, float overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
	}
	
	/*--------------Getters----------*/
	
	/*public Long getId() {
		return id;
	}*/

	public int getRuns() {
		return runs;
	}

	public int getWickets() {
		return wickets;
	}

	public float getOvers() {
		return overs;
	}

}
