package com.ipfl.data.domains;

import java.util.Date;
import java.util.List;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.neo4j.ogm.annotation.typeconversion.DateString;

@RelationshipEntity(type = "PLAYS_FOR")
public class PLRole {
	
	/*--------------Member Variables----------*/
	
@Id @GeneratedValue
Long id;

@Property(name="PLRole")
private List<String> plroles;

@Property(name="StartDate")
@DateString ("YYYY-MM-DD")
private Date startDate;

@Property(name="EndDate")
@DateString ("YYYY-MM-DD")
private Date endDate;


@StartNode
private Player player;

@EndNode
private PLTeam plteam;

/*--------------Constructors----------*/

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

/*--------------Getters----------*/

public List<String> getPlroles() {
	return plroles;
}

public PLTeam getPlteam() {
	return plteam;
}

public Player getPlayer() {
	return player;
}

public Date getStartDate() {
	return startDate;
}

public Date getEndDate() {
	return endDate;
}



}
