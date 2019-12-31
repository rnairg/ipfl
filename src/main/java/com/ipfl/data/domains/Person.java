package com.ipfl.data.domains;
import org.neo4j.ogm.annotation.CompositeIndex;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Required;

@NodeEntity
@CompositeIndex(value= {"name"},unique = true)
public class Person {
	
	/*--------------Member Variables----------*/
	
	@Id @GeneratedValue
	Long id;
	
	@Property
	@Required
	private String name;
	
	/*--------------Constructors----------*/
	
	public Person(){}
	
	/*--------------Getters----------*/

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}
}
