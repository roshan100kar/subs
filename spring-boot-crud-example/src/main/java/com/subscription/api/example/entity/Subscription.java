package com.subscription.api.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sub_tbbl")
public class Subscription {
	
    @Id
	@GeneratedValue
	private int id;
	private String name;
	private int subdate;
	private double subdesc;
	

	public Subscription(int id, String name, int subdate, double subdesc) {
		super();
		this.id = id;
		this.name = name;
		this.subdate = subdate;
		this.subdesc = subdesc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSubdate() {
		return subdate;
	}
	public void setSubdate(int subdate) {
		this.subdate = subdate;
	}
	public double getSubdesc() {
		return subdesc;
	}
	public void setSubdesc(double subdesc) {
		this.subdesc = subdesc;
	}
	
}
