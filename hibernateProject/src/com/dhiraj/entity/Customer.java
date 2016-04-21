package com.dhiraj.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;



@Entity
@javax.persistence.Table
public class Customer {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
private int cid;
	@Column(name="cname",length=10 )
private String cname;
	@Embedded
private Address address;

	@OneToMany(mappedBy="customer")
private Set<Vehicle> setVehicle=new HashSet<>();
	
	public Customer() {
	}
	
	
public Customer(int cid, String cname, Address address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
	}

	

public Set<Vehicle> getSetVehicle() {
	return setVehicle;
}


public void setSetVehicle(Set<Vehicle> setVehicle) {
	this.setVehicle = setVehicle;
}


public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

}
