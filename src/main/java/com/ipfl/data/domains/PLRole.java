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
@RelationshipEntity(type = "PLAYS_FOR")
public class PLRole {
	

@Id @GeneratedValue
Long id;

@Property(name="PLRole")
private List<String> plroles;

@StartNode
private Player player;

@EndNode
private PLTeam plteam;

public PLRole() {
	
}

public PLRole(Player player, PLTeam plteam, List<String> plroles) {
	super();
	this.plroles = plroles;
	this.player = player;
	this.plteam = plteam;
}
public PLRole(PLTeam plteam, List<String> plroles) {
	super();
	this.plroles = plroles;
	this.plteam = plteam;
}


public List<String> getPlroles() {
	return plroles;
}

public void setPlroles(List<String> plroles) {
	this.plroles = plroles;
}

public PLTeam getPlteam() {
	return plteam;
}

public void setPlteam(PLTeam plteam) {
	this.plteam = plteam;
}


public Player getPlayer() {
	return player;
}

public void setPlayer(Player player) {
	this.player = player;
}

}
