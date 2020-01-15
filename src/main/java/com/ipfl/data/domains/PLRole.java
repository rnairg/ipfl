package com.ipfl.data.domains;

import java.util.Date;
import java.util.List;

import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.typeconversion.DateString;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@RelationshipEntity(type = "PLAYS_FOR")
public class PLRole extends Relationship<Player, PLTeam>{
	
	/*--------------Member Variables----------*/
	
@Property(name="PLRole")
private List<String> plroles;

@Property(name="StartDate")
@DateString ("YYYY-MM-DD")
private Date startDate;

@Property(name="EndDate")
@DateString ("YYYY-MM-DD")
private Date endDate;

/*--------------Constructors----------*/

public PLRole() {
	super();
}

@JsonCreator
public PLRole(@JsonProperty("Player") Player player, @JsonProperty("PLTeam") PLTeam plteam, List<String> plroles, Date startDate, Date endDate) {
	super(player, plteam);
	this.plroles = plroles;
	this.startDate = startDate;
	this.endDate = endDate;
}

/*--------------Getters----------*/



public List<String> getPlroles() {
	return plroles;
}

public Player getPlayer() {
	return super.getStartNode();
}

public PLTeam getPlteam() {
	return super.getEndNode();
}

public Date getStartDate() {
	return startDate;
}

public Date getEndDate() {
	return endDate;
}



}
