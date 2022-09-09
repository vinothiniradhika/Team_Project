package com.saloon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shopregister")
public class ShopSignup {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	 private String shopname;
	 private String owner;
	 private String location;
	 private String sphone;
	 private String sremail;
	 private String srpassword;
	 private String regno;
	 private String services;
	@Override
	public String toString() {
		return "ShopSignup [sid=" + sid + ", shopname=" + shopname + ", owner=" + owner + ", location=" + location
				+ ", sphone=" + sphone + ", sremail=" + sremail + ", srpassword=" + srpassword + ", regno=" + regno
				+ ", services=" + services + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getSremail() {
		return sremail;
	}
	public void setSremail(String sremail) {
		this.sremail = sremail;
	}
	public String getSrpassword() {
		return srpassword;
	}
	public void setSrpassword(String srpassword) {
		this.srpassword = srpassword;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	 
	 
	 
	 

}
