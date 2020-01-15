package com.ipfl.data.domains;


import java.util.List;

import org.neo4j.ogm.annotation.Relationship;


public class FantasyTeam extends Node {
	
	/*--------------Member Variables----------*/
	
	@Relationship(type = "PICKED_IN", direction= Relationship.INCOMING)
	private List<Player> players;

	/*--------------Constructors----------*/
	
	public FantasyTeam() {
		super();
	}
	

	/*--------------Getters----------*/
	
	public List<Player> getPlayers() {
		return players;
	}

}
