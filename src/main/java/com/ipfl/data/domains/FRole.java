package com.ipfl.data.domains;

import java.util.Collection;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "PICKED_IN")
public class FRole {
	@Id @GeneratedValue
	Long id;

	private Collection<String> froles;

	@StartNode
	private Player player;

	@EndNode
	private Collection<FantasyTeam> fteam;

	public Collection<String> getFroles() {
		return froles;
	}

	public void setFroles(Collection<String> froles) {
		this.froles = froles;
	}
	
	

}
