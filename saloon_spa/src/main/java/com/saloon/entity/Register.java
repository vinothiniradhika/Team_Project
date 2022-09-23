package com.saloon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Register")
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="rid")
	private long rid;
	private String shopnum;
	private String services;
	private String sphone;
	private String location;
	private String owner;
	public Register() {
		
	}
	
	
	
	public Register(long rid, String shopnum, String services, String sphone, String location,
			String owner) {
		super();
		this.rid = rid;
		this.shopnum = shopnum;
		this.services = services;
		this.sphone = sphone;
		this.location = location;
		this.owner = owner;
	}
	
	public long getRid() {
		return rid;
	}
	public void setRid(long rid) {
		this.rid = rid;
	}
	public String getShopnum() {
		return shopnum;
	}
	public void setShopnum(String shopnum) {
		this.shopnum = shopnum;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	

}
