package com.saloon.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="shopsignup")
public class ShopSignup {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sid")
	 private long sid;
	private String shopname;
	 

	private String sremail;
	 private String srpassword;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name="reg_id")
	 private Register register;

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public ShopSignup() {
		
	}
	public ShopSignup(long sid, String shopname, String sremail, String srpassword, Register register) {
		super();
		this.sid = sid;
		this.shopname = shopname;
		this.sremail = sremail;
		this.srpassword = srpassword;
		this.register = register;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
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
	
	
	 
	 
	 

}
