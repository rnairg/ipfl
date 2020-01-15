package com.ipfl.data.domains;

import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Required;

@NodeEntity
public abstract class Node extends BaseEntity {
	
	/*--------------Member Variables----------*/
	
	@Required
	@Index(unique=true)
	private String name;
	
	
	/*--------------Constructors----------*/

	public Node() {
		super();
	}
	
	/*--------------Getters----------*/
	
	public String getName() {
		return name;
	}
}
