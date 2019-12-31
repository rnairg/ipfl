package com.ipfl.data.domains;

import java.util.List;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("player")
@RelationshipEntity(type = "PICKED_IN")
public class FRole {
	
	/*--------------Member Variables----------*/
	
	@Id @GeneratedValue
	Long id;
	
	@Property(name="FRole")
	private List<String> froles;

	@StartNode
	private Player player;

	@EndNode
	private FantasyTeam fteam;

	/*--------------Constructors----------*/

	public FRole() {}
	
	/*--------------Getters----------*/

	public Long getId() {
		return id;
	}

	public List<String> getFroles() {
		return froles;
	}

	public Player getPlayer() {
		return player;
	}

	public FantasyTeam getFteam() {
		return fteam;
	}

}
