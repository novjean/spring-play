package com.novjean.springaop.service;

import com.novjean.springaop.aspect.LoggingAspect;
import com.novjean.springaop.model.Circle;

public class ShapeServiceProxy extends ShapeService {

	public Circle getCircle() {
		new LoggingAspect().LoggingAdvice();
		return super.getCircle();
	}
}
