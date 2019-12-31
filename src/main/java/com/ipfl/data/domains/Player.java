package com.ipfl.data.domains;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Required;


@NodeEntity (label = "Player")

public class Player extends Person {
	
	/*--------------Member Variables----------*/

	@Property
	@Required
	private String nationality;
	
	@Relationship(type="PLAYS_FOR")
	private PLRole plrole;
	
	@Relationship(type="PICKED_IN")
	private List<FRole> frole;
	
	@Relationship(type="PLAYED_IN")
	private List<PlayerStats> playerStats;
	
	/*--------------Constructors----------*/

	public Player() {}

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
