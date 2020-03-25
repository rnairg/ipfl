package com.ipfl.data.domains;

import java.util.Date;
import java.util.List;

import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Required;
import org.neo4j.ogm.annotation.typeconversion.DateString;


public class Match extends Node {
	
	/*--------------Member Variables----------*/
	
	@Property
	@Required
	@DateString ("YYYY-MM-DD")
	private Date matchDate;
	
	@Relationship(type="PLAYED", direction= Relationship.INCOMING)
	private PLTeam plTeam1;

	@Relationship(type="PLAYED", direction= Relationship.INCOMING)
	private PLTeam plTeam2;

	@Relationship(type="GENERATED")
	private MatchStats matchStats1;

	@Relationship(type="GENERATED")
	private MatchStats matchStats2;

	@Relationship(type="GENERATED")
	private List<PlayerStats> playerStats;
	
	/*--------------Constructors----------*/
	
	public Match() {}

	/*--------------Getters----------*/

	public Date getMatchDate() {
		return matchDate;
	}

	public PLTeam getPlTeam1() {
		return plTeam1;
	}

	public PLTeam getPlTeam2() {
		return plTeam2;
	}

}
