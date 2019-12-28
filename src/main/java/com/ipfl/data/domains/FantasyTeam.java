package com.ipfl.data.domains;


import java.util.List;

import org.neo4j.ogm.annotation.CompositeIndex;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
@CompositeIndex(value= {"name"},unique = true)
public class FantasyTeam {
	
	/*--------------Member Variables----------*/
	
	@Id @GeneratedValue
	Long id;
	
	private String name;
	
	@Relationship(type = "PICKED_IN", direction= Relationship.INCOMING)
	private List<Player> players;

	/*--------------Constructors----------*/
	
	public FantasyTeam() {}
	
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
