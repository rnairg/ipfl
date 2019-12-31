package com.ipfl.data.domains;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Required;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@NodeEntity (label = "Player")

public class Player extends Person {
	
	/*--------------Member Variables----------*/

	@Property
	@Required
	private String nationality;
	
	@JsonIgnoreProperties("player")
	@Relationship(type="PLAYS_FOR")
	private PLRole plrole;
	
	@JsonIgnoreProperties("player")
	@Relationship(type="PICKED_IN")
	private List<FRole> frole;
	
	@JsonIgnoreProperties("player")
	@Relationship(type="PLAYED_IN")
	private List<PlayerStats> playerStats;
	
	/*--------------Constructors----------*/

	public Player() {
		super();
	}

	/*--------------Getters----------*/

	public String getNationality() {
		return nationality;
	}


	public PLRole getPlrole() {
		return plrole;
	}

	public List<FRole> getFrole() {
		return frole;
	}
	
	public List<PlayerStats> getPlayerStats() {
		return playerStats;
	}
	
	
	
}
