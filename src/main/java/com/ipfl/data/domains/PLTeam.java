package com.ipfl.data.domains;

import java.util.List;

import org.neo4j.ogm.annotation.CompositeIndex;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@NodeEntity (label = "PLTeam")
@CompositeIndex(value= {"name"},unique = true)
public class PLTeam {
	
	@Id @GeneratedValue
	Long id;
	
	@Property
	private String name;
	
	//@JsonIgnoreProperties("plteam")
	@Relationship(type = "PLAYS_FOR", direction= Relationship.INCOMING)
	private List<Player> players;
	
	public PLTeam() {}
	
	public PLTeam(Long id) {
		this.id=id;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
}
