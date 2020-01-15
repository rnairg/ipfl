package com.ipfl.data.domains;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Version;


public abstract class BaseEntity {
	
	/*--------------Member Variables----------*/
	
	@Id @GeneratedValue
	private Long id;
	
	@Version
	private Long version;

	/*--------------Constructors----------*/
	public BaseEntity() {

	}
	
	/*--------------Getters----------*/

	public Long getVersion() {
		return version;
	}

	public Long getId() {
		return id;
	}

}
