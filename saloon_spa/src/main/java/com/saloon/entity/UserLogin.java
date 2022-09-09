package com.saloon.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userlogin")
public class UserLogin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uid;
	private String uemail;
	private String upassword;
	@Override
	public String toString() {
		return "UserLogin [uid=" + uid + ", uemail=" + uemail + ", upassword=" + upassword + "]";
	}
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	
	

}
