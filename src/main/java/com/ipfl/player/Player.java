package com.ipfl.player;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Required;

import com.ipfl.data.domains.Person;
import com.ipfl.player.relationship.fantasyTeam.FRole;
import com.ipfl.player.relationship.match.PlayerStats;
import com.ipfl.player.relationship.plTeam.PLRole;


@NodeEntity (label = "Player")

public class Player extends Person {
	
	/*--------------Member Variables----------*/

	@Property
	@Required
	private String nationality;
	
	@Relationship(type="PLAYS_FOR")
	private PLRole plrole;
	
	@Relationship(type="PICKED_IN")
	private FRole frole;
	
	@Relationship(type="PLAYED_IN")
	private PlayerStats playerStats;
	
	/*--------------Constructors----------*/

	public Player() {}

	/*--------------Getters----------*/

	public String getNationality() {
		return nationality;
	}

	public PLRole getPlrole() {
		return plrole;
	}

	public FRole getFrole() {
		return frole;
	}
	
	public PlayerStats getPlayerStats() {
		return playerStats;
	}
	
}
