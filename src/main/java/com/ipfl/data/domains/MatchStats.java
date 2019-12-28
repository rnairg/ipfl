package com.ipfl.data.domains;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity (type="PLAYED")
public class MatchStats {
	
	/*--------------Member Variables----------*/
	
	@Id @GeneratedValue
	Long id;
	
	@StartNode
	private PLTeam plTeam;
	
	@EndNode
	private Match match;
	
	@Property
	private int runs;
	
	@Property
	private int wickets;
	
	@Property
	private float overs;
	
	
	/*--------------Constructors----------*/

	public MatchStats() {}
	
	/*--------------Getters----------*/
	
	public Long getId() {
		return id;
	}

	public PLTeam getPlTeam() {
		return plTeam;
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

	public float getOvers() {
		return overs;
	}

}
