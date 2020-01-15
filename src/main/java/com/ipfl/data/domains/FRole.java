package com.ipfl.data.domains;

import java.util.Date;
import java.util.List;

//import org.neo4j.ogm.annotation.EndNode;
//import org.neo4j.ogm.annotation.GeneratedValue;
//import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
//import org.neo4j.ogm.annotation.StartNode;
import org.neo4j.ogm.annotation.typeconversion.DateString;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@RelationshipEntity(type = "PICKED_IN")
public class FRole extends Relationship<Player, FantasyTeam> {
	
	/*--------------Member Variables----------*/
	
	@Property(name="FRole")
	private List<String> froles;
	
	@Property(name="StartDate")
	@DateString ("YYYY-MM-DD")
	private Date startDate;

	@Property(name="EndDate")
	@DateString ("YYYY-MM-DD")
	private Date endDate;

	/*--------------Constructors----------*/

	public FRole() {
		super();
	}
	
	@JsonCreator
	public FRole(@JsonProperty("Player") Player player, @JsonProperty("FantasyTeam") FantasyTeam fteam, List<String> froles, Date startDate, Date endDate) {
		super(player, fteam);
		this.froles = froles;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	/*--------------Getters----------*/


	public List<String> getFroles() {
		return froles;
	}
	
	
	public Player getPlayer() {
		return super.getStartNode();
	}
	
	public FantasyTeam getFteam() {
		return super.getEndNode();
	}


	public Date getStartDate() {
		return startDate;
	}


	public Date getEndDate() {
		return endDate;
	}
}
