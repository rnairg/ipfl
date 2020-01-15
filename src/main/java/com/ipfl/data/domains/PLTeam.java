package com.ipfl.data.domains;

import java.util.List;

import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Required;


public class PLTeam  extends Node{
	
	/*--------------Member Variables----------*/
	
	@Property
	@Required
	private String code;
	
	@Relationship(type = "PLAYS_FOR", direction= Relationship.INCOMING)
	private List<Player> players;
	
	/*--------------Constructors----------*/
	
	public PLTeam() {}
		
	/*--------------Getters----------*/
	


	public List<Player> getPlayers() {
		return players;
	}

	public String getCode() {
		return code;
	}
	
}
