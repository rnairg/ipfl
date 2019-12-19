package com.ipfl.data.domains;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class Person {
	
	@Id @GeneratedValue
	Long id;
	
	@Property
	private String name;
	
	
	public Person(){
		
	}
	
	public Person(Long id, String name) {
		this.id = id;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
