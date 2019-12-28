package com.ipfl.data.domains;

import java.util.List;

public class RelationshipTemp {
	
	/*--------------Member Variables----------*/
	
	String startNode;
	String endNode;
	List<String> roles;
	
	/*--------------Constructors----------*/
	
	public RelationshipTemp(String startNode, String endNode, List<String> roles) {
		super();
		this.startNode = startNode;
		this.endNode = endNode;
		this.roles = roles;
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

}
