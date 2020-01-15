package com.ipfl.data.domains;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.StartNode;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class Relationship<S extends Node, E extends Node> extends BaseEntity {
	
	/*--------------Member Variables----------*/
	
	@StartNode
	private S startNode;
	
	@EndNode
	private E endNode;
	
	/*--------------Constructors----------*/
	
	public Relationship() {}
	
	public Relationship(Long id, S startNode, E endNode) {
		//this.id = id;
		this.startNode = startNode;
		this.endNode = endNode;
	}
	
	public Relationship(S startNode, E endNode) {
		this.startNode = startNode;
		this.endNode = endNode;
	}
	
	/*--------------Getters----------*/
	
	
	@JsonIgnore
	public S getStartNode() {
		return startNode;
	}
	
	@JsonIgnore
	public E getEndNode() {
		return endNode;
	}
}
