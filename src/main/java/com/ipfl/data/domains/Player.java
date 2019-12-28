package com.ipfl.data.domains;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;


@NodeEntity (label = "Player")

public class Player extends Person {
	
	/*--------------Member Variables----------*/

	@Property
	private String nationality;
	
	@Relationship(type="PLAYS_FOR")
	private PLRole plrole;
	
	@Relationship(type="PICKED_IN")
	private FRole frole;
	
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
	
}
