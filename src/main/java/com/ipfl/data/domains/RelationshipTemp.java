package com.ipfl.data.domains;

import java.util.List;

public class RelationshipTemp {
	
	/*--------------Member Variables----------*/
	
	String startNode;
	String endNode;
	List<String> roles;
	int runs;
	int wickets;
	int overs;
	
	/*--------------Constructors----------*/
	
	public RelationshipTemp(String startNode, String endNode, List<String> roles) {
		super();
		this.startNode = startNode;
		this.endNode = endNode;
		this.roles = roles;
	}
	public RelationshipTemp(String startNode, String endNode, int runs, int wickets, int overs) {
		super();
		this.startNode = startNode;
		this.endNode = endNode;
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
	}

	public RelationshipTemp() {
		super();
	}
	
	/*--------------Getters----------*/

	public String getStartNode() {
		return startNode;
	}

	public String getEndNode() {
		return endNode;
	}

	public List<String> getRoles() {
		return roles;
	}
	public int getRuns() {
		return runs;
	}
	public int getWickets() {
		return wickets;
	}
	public int getOvers() {
		return overs;
	}
	

}
