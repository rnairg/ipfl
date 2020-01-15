package com.ipfl.data.domains;


//import org.neo4j.ogm.annotation.EndNode;
//import org.neo4j.ogm.annotation.GeneratedValue;
//import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
//import org.neo4j.ogm.annotation.StartNode;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@RelationshipEntity (type="PLAYED")
public class MatchStats extends Relationship<PLTeam, Match>{
	
	/*--------------Member Variables----------*/
	
	@Property(name = "Runs")
	private int runs;
	
	@Property(name = "Wickets")
	private int wickets;
	
	@Property(name = "Overs")
	private float overs;
	
	
	/*--------------Constructors----------*/

	public MatchStats() {}
	
	@JsonCreator
	public MatchStats(@JsonProperty("PLTeam") PLTeam plteam, @JsonProperty("Match") Match match, int runs, int wickets, float overs) {
		super(plteam, match);
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
	}
	
	/*--------------Getters----------*/
	
	/*public Long getId() {
		return id;
	}*/

	public PLTeam getPlTeam() {
		return super.getStartNode();
	}
	
	public Match getMatch() {
		return super.getEndNode();
	}

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
