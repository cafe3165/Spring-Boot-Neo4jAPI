package com.appleyk.nodeentity;


import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
 
@NodeEntity
public class Cat extends BaseEntity {
	@GraphId
	private Long id;
	private String color;
 
	public Cat() {
 
	}
 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}
 
	public void setColor(String color) {
		this.color = color;
	}
 
}
