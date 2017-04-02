package com.novjean.hibernate;

import java.util.Date;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.novjean.dto.Address;
import com.novjean.dto.FourWheeler;
import com.novjean.dto.TwoWheeler;
import com.novjean.dto.UserDetails;
import com.novjean.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args){
		
//		Vehicle vehicle = new Vehicle();
//		vehicle.setVehicleName("Jaguar");
//		
//		TwoWheeler bike = new TwoWheeler();
//		bike.setVehicleName("Yamaha");
//		bike.setSteeringHandle("Bike handle");
//		
//		FourWheeler car = new FourWheeler();
//		car.setVehicleName("Porsche");
//		car.setSteeringWheel("sports");
		
//		Vehicle vehicle2 = new Vehicle();
//		vehicle2.setVehicleName("BMW");
//		
//		user.getVehicle().add(vehicle);
//		user.getVehicle().add(vehicle2);
//		vehicle.getUserList().add(user);
//		vehicle2.getUserList().add(user);
		
		//String minUserId = "5 or 1=1"; //SQL Injection Example
		String minUserId = "5";
		String minUserName = "User 8";

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		UserDetails user = session.get(UserDetails.class, 1);
//		user.setUserName("Updated User");
		
		session.getTransaction().commit();
		session.close();
		
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		
		UserDetails user2 = session2.get(UserDetails.class, 1);
		
		session2.getTransaction().commit();
		session2.close();
		
		
//		Criteria criteria = session. .createCriteria(UserDetails.class);
		
//		CriteriaBuilder builder = session.getCriteriaBuilder();
//		CriteriaQuery<UserDetails> criteria = builder.createQuery(UserDetails.class);
		
//		@SuppressWarnings("deprecation")
//		Criteria criteria = session.createCriteria(UserDetails.class);
//		criteria.add(Restrictions.eq("userName", "User 8"))
//			.add(Restrictions.gt("userId", 4));
//		criteria.add(Restrictions.like("userName", "%User 0%"))
//			.add(Restrictions.between("userId", 0, 20));
//		criteria.add(Restrictions.or(Restrictions.between("userId", 0, 3), Restrictions.between("userId", 7, 9)));
	
//		Criteria criteria = session.createCriteria(UserDetails.class)
//		.setProjection(Projections.max("userId"))
//		.addOrder(Order.desc("userId"));
		
//		UserDetails exampleUser = new UserDetails();
////		exampleUser.setUserId(5);
//		exampleUser.setUserName("User 4");
//		
//		Example example = Example.create(exampleUser).excludeProperty("userName");
//		
//		Criteria criteria = session.createCriteria(UserDetails.class)
//				.add(example);
//			
//		List<UserDetails> users = (List<UserDetails>)criteria.list();

				
//		TypedQuery query = session.createQuery("select new map(userId, userName) from UserDetails");
//		TypedQuery query = session.createQuery("select max(userId) from UserDetails");

//		query.setFirstResult(5);
//		query.setMaxResults(4);
		
//		TypedQuery query = session.createQuery("from UserDetails where userId>? and userName=?");
//		query.setParameter(0, Integer.parseInt(minUserId));
//		query.setParameter(1, minUserName);
		
//		TypedQuery query = session.getNamedQuery("UserDetails.byName");
//		query.setParameter(0, minUserName);
//		
//		List<UserDetails> users = (List<UserDetails>)query.getResultList();

//		session.getTransaction().commit();
//		session.close();

//		System.out.println("size of list result: " + users.size());
//		
//		for(UserDetails u:users)
//			System.out.println(u.getUserName());
//		
//		session.persist(user);
//		session.save(vehicle);
//		session.save(bike);
//		session.save(car);
		
		
//		for(int i=0; i<10; i++){
//		UserDetails user = new UserDetails();
//		user.setUserName("User "+ i);
//		session.save(user);
//	}
	
	//	UserDetails user = session.get(UserDetails.class, 7);
	//	System.out.println("Username : " + user.getUserName());
		
	//	session.delete(user);
	//	System.out.println("Record deleted");
		
	//	user.setUserName("Updated user");
	//	session.update(user);		
		
		
//		user = null;
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		user = session.get(UserDetails.class, 1);
//		System.out.println("UserName retrieved: " +user.getUserName());
//		session.close();
		
		
//		user.setJoinedDate(new Date());
//		user.setDescription("Description of the user goes here");
		
		//Lazy initialization
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		user = session.get(UserDetails.class, 1);
//		session.close();
//		System.out.println(user.getListOfAddresses().size());   //would run into an error because session closed
		
		
//		Address addr = new Address();
//		addr.setStreet("Street Name");
//		addr.setCity("City name");
//		addr.setState("Kerala");
//		addr.setPincode("686016");
//
//		Address addr2 = new Address();
//		addr2.setStreet("Office Street Name");
//		addr2.setCity("Office City name");
//		addr2.setState("Kochi");
//		addr2.setPincode("090");
//		
//		user.getListOfAddresses().add(addr);
//		user.getListOfAddresses().add(addr2);
		
	}
}
