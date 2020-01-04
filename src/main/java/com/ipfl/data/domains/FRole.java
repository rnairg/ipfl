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
	
	@Property(name="StartDate")
	@DateString ("YYYY-MM-DD")
	private Date startDate;

	@Property(name="EndDate")
	@DateString ("YYYY-MM-DD")
	private Date endDate;

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


	public Date getStartDate() {
		return startDate;
	}


	public Date getEndDate() {
		return endDate;
	}
	
	
	

}
