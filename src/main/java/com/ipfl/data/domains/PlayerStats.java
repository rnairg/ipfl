package com.ipfl.data.domains;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity (type = "PLAYED_IN")
public class PlayerStats {
	
	/*--------------Member Variables----------*/
	
	@Id @GeneratedValue
	Long id;
	
	@StartNode
	private Player player;
	
	@EndNode
	private Match match;
	
	@Property
	private int runs;
	
	@Property
	private int wickets;
	
	@Property
	private float catches;

	
	
	/*--------------Constructors----------*/
	
	public PlayerStats() {}
	
	/*--------------Getters----------*/

	public Long getId() {
		return id;
	}



	public Player getPlayer() {
		return player;
	}



	public Match getMatch() {
		return match;
	}



	public int getRuns() {
		return runs;
	}



	public int getWickets() {
		return wickets;
	}



	public float getCatches() {
		return catches;
	}

}
