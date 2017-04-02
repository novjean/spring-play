package com.novjean.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.novjean.springaop.service.FactoryService;
import com.novjean.springaop.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
//		
		
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService)factoryService.getBean("shapeService");
		
		//shapeService.getCircle().setAndReturnName("dummy");
	
		System.out.println(shapeService.getCircle().getName());
	
	}
	

}
