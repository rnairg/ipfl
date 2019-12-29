package com.ipfl.plTeam;

import java.util.List;

import org.neo4j.ogm.annotation.CompositeIndex;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Required;

import com.ipfl.player.Player;


@NodeEntity (label = "PLTeam")
@CompositeIndex(value= {"name"},unique = true)
public class PLTeam {
	
	/*--------------Member Variables----------*/
	
	@Id @GeneratedValue
	Long id;
	
	@Property
	@Required
	private String name;
	
	@Property
	@Required
	private String code;
	
	@Relationship(type = "PLAYS_FOR", direction= Relationship.INCOMING)
	private List<Player> players;
	
	/*--------------Constructors----------*/
	
	public PLTeam() {}
	
	public PLTeam(Long id) {
		this.id=id;
	}
	
	/*--------------Getters----------*/
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public String getCode() {
		return code;
	}
	
}
