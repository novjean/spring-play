package com.novjean.springaop.service;

import com.novjean.springaop.aspect.Loggable;
import com.novjean.springaop.model.Circle;
import com.novjean.springaop.model.Triangle;

public class ShapeService {

	private Circle circle;
	private Triangle triangle;
	
	@Loggable
	public Circle getCircle() {
		System.out.println("Circle getter called.");
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	
	
}
