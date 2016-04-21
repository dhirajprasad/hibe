package com.dhiraj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
@Entity
@Table(name="Vehicle")
public class Vehicle {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private int vid;
	@Column(name="type",length=15)
	private String vtype;
	@Column(name="no")
	@Type(type="int")
	private int vno;
	@Column(name="model")
	private String model;
	@ManyToOne
	@JoinColumn(name="cid")
	Customer customer;
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVtype() {
		return vtype;
	}
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vtype=" + vtype + ", vno=" + vno
				+ ", model=" + model + ", customer=" + customer + "]";
	}
	
	
}
