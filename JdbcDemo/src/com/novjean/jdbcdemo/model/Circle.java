package com.novjean.jdbcdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Circle {
	
	@Id
	private int id;
	private String name;

	public Circle(int circleId, String name){
		setId(circleId);
		setName(name);
	}
	
	public Circle() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
