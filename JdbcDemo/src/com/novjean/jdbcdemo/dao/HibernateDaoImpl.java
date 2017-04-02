package com.novjean.jdbcdemo.dao;

import javax.persistence.TypedQuery;

//import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.novjean.jdbcdemo.model.Circle;

@Repository
public class HibernateDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;
	
	public int getCircleCount(){
		
		String hql = "select count(*) from Circle";
		TypedQuery query = getSessionFactory().openSession().createQuery(hql);
		return query.getResultList().size();
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
