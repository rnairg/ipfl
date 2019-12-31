package com.ipfl.data.domains;


import java.util.List;

import org.neo4j.ogm.annotation.CompositeIndex;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Required;

@NodeEntity
@CompositeIndex(value= {"name"},unique = true)
public class FantasyTeam {
	
	/*--------------Member Variables----------*/
	
	@Id @GeneratedValue
	Long id;
	
	@Property
	@Required
	private String name;
	
	@Relationship(type = "PICKED_IN", direction= Relationship.INCOMING)
	private List<Player> players;

	/*--------------Constructors----------*/
	
	public FantasyTeam() {}
	
	
	/*public FantasyTeam(String name) {
		super();
		this.name = name;
	}*/



	/*--------------Getters----------*/
	
	public List<Player> getPlayers() {
		return players;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
