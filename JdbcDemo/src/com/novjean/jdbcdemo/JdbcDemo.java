package com.novjean.jdbcdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.novjean.jdbcdemo.dao.HibernateDaoImpl;
import com.novjean.jdbcdemo.dao.JdbcDaoImpl;
import com.novjean.jdbcdemo.dao.JdbcTemplateDaoImpl;
import com.novjean.jdbcdemo.model.Circle;

public class JdbcDemo {

	public static void main(String[] args) {
		
		//Circle circle = new JdbcDaoImpl().getCircle(1);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("");
//		JdbcTemplateDaoImpl dao = ctx.getBean("jdbcTemplateDaoImpl", JdbcTemplateDaoImpl.class);
		HibernateDaoImpl dao = ctx.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		
		
//		Circle circle = dao.getCircle(1);
//		System.out.println(circle.getName());
	
//		System.out.println(dao.getCircleCount());	
//		dao.insertCircle(new Circle(6,"Sixth Circle"));
		
		System.out.println(dao.getCircleCount());
		
//		dao.createTriangleTable();
		
		((ConfigurableApplicationContext)ctx).close();	//Closing the ApplicationContext
	}

}
