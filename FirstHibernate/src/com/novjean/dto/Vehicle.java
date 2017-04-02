package com.novjean.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;



//@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn{name="VEHICLE_TYPE",discriminatorType=DiscriminatorType.STRING}

@Entity
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy=InheritanceType.JOINED)
public class Vehicle {
	
	@Id @GeneratedValue
	private int vehicleId;
	private String vehicleName;

	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	
	
//	@JoinColumn(name="USER_ID")

//	@ManyToMany (mappedBy="vehicle")
//	private Collection<UserDetails> userList = new ArrayList<UserDetails>();;
//	
//
//	public Collection<UserDetails> getUserList() {
//		return userList;
//	}
//	public void setUserList(Collection<UserDetails> userList) {
//		this.userList = userList;
//	}
//	
//	@ManyToOne
//	@NotFound(action=NotFoundAction.IGNORE)
//	private UserDetails user;
//
//	public UserDetails getUser() {
//		return user;
//	}
//	public void setUser(UserDetails user) {
//		this.user = user;
//	}
	
}
