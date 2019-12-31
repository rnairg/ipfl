package com.ipfl.data.domains;

import java.util.Date;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Required;
import org.neo4j.ogm.annotation.typeconversion.DateString;

@NodeEntity (label = "Match")
public class Match {
	
	/*--------------Member Variables----------*/
	@Id @GeneratedValue
	Long id;
	
	@Property
	@Required
	private String name;
	
	@Property
	@Required
	@DateString ("YYYY-MM-DD")
	private Date matchDate;
	
	@Relationship(type="PLAYED", direction= Relationship.INCOMING)
	private List<PLTeam> plTeam;
	
	@Relationship(type="PLAYED_IN", direction= Relationship.INCOMING)
	private List<Player> player;
	
	/*--------------Constructors----------*/
	
	public Match() {}

	/*--------------Getters----------*/

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public List<PLTeam> getPlTeam() {
		return plTeam;
	}
	
	public List<Player> getPlayer() {
		return player;
	}

}
