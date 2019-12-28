package com.ipfl.data.domains;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;


@NodeEntity (label = "Player")

public class Player extends Person {

	@Property
	private String nationality;
	
	@Relationship(type="PLAYS_FOR")
	private PLRole plrole;
	
	@Relationship(type="PICKED_IN")
	private FRole frole;

	public Player() {
		
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public PLRole getPlrole() {
		return plrole;
	}

	public void setPlrole(PLRole plrole) {
		this.plrole = plrole;
	}

	public FRole getFrole() {
		return frole;
	}

	public void setFrole(FRole frole) {
		this.frole = frole;
	}

	
}
