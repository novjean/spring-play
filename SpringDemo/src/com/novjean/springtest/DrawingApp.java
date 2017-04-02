package com.novjean.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Shape shape = (Shape)context.getBean("circle");
		shape.draw();
		
//		System.out.println(context.getMessage("greeting", null, "Default Greeting", null));
		context.close();
		
	}

}