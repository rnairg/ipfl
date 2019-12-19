package com.ipfl.data.domains;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


@NodeEntity (label = "PLTeam")
public class PLTeam {
	
	@Id @GeneratedValue
	Long id;
	
	@Property
	private String name;
	
	
	public PLTeam() {}
	
	public PLTeam(Long id) {
		this.id=id;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
