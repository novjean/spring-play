package com.novjean.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SelectBeforeUpdate;
import org.hibernate.annotations.Type;


//@Table (name="USER_DETAILS")
@Entity
//@Cacheable
//@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@SelectBeforeUpdate
@NamedQuery(name="UserDetails.byId", query="from UserDetails where userId = ?")
//@NamedNativeQuery(name="UserDetails.byName", query = "select * from userdetails where username = ?", 
//				resultClass=UserDetails.class)
public class UserDetails {

//	@EmbeddedId // Used for ID objects
	@Id @GeneratedValue(strategy=GenerationType.AUTO )
	private int userId;
//	@Transient
	private String userName;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
//	@JoinTable(name="USER_VEHICLE")
//	@OneToMany (mappedBy="user")
	
//	@ManyToMany
//	@OneToMany (cascade=CascadeType.PERSIST)
//	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
//	
//	public Collection<Vehicle> getVehicle() {
//		return vehicle;
//	}
//	public void setVehicle(Collection<Vehicle> vehicle) {
//		this.vehicle = vehicle;
//	}

//	@OneToOne
//	@JoinColumn(name="VEHICLE_ID")
//	private Vehicle vehicle;
//	
//	public Vehicle getVehicle() {
//		return vehicle;
//	}
//	public void setVehicle(Vehicle vehicle) {
//		this.vehicle = vehicle;
//	}

//	@ElementCollection (fetch=FetchType.EAGER)
//	@JoinTable(name="USER_ADDRESS")
//	private Collection<Address> listOfAddresses = new ArrayList<Address>();
//	
//	public Collection<Address> getListOfAddresses() { 
//		return listOfAddresses;
//	}
//	public void setListOfAddresses(Collection<Address> listOfAddresses) {
//		this.listOfAddresses = listOfAddresses;
//	}
//	
	
//	@ElementCollection
//	@JoinTable(name="USER_ADDRESS")
//	@GenericGenerator(name="sequence-gen", strategy="sequence")
//	@CollectionId(columns = { @Column(name="USER_ID") }, generator = "sequence-gen", type = @Type(type="long"))
//	private Collection<Address> listOfAddresses = new ArrayList<Address>();
//	
//	@Temporal(TemporalType.DATE)
//	private Date joinedDate;
//	
//	@Embedded
//	@AttributeOverrides({
//		@AttributeOverride(name="street", column=@Column(name="HOME_STREET_NAME")),
//		@AttributeOverride(name="city", column=@Column(name="HOME_CITY_NAME")),
//		@AttributeOverride(name="state", column=@Column(name="HOME_STATE_NAME")),
//		@AttributeOverride(name="pincode", column=@Column(name="HOME_PIN_NAME"))
//	})
//	private Address homeAddress;
//	@Embedded
//	private Address officeAddress;
//	
////	@Lob
//	private String description;

//	@JoinTable(name="USER_ADDRESS",
//	joinColumns= @JoinColumn (name="USER_ID"))
//	@ElementCollection
//	@JoinTable(name="USER_ADDRESS")
//	private Set<Address> listOfAddresses = new HashSet<Address>();
//	public Set<Address> getListOfAddresses() {
//		return listOfAddresses;
//	}
//	public void setListOfAddresses(Set<Address> listOfAddresses) {
//		this.listOfAddresses = listOfAddresses;
//	}
	
//	public Date getJoinedDate() {
//		return joinedDate;
//	}
//	public void setJoinedDate(Date joinedDate) {
//		this.joinedDate = joinedDate;
//	}
//
//	public Address getHomeAddress() {
//		return homeAddress;
//	}
//	public void setHomeAddress(Address homeAddress) {
//		this.homeAddress = homeAddress;
//	}
//	public Address getOfficeAddress() {
//		return officeAddress;
//	}
//	public void setOfficeAddress(Address officeAddress) {
//		this.officeAddress = officeAddress;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
	
}
