package com.saloon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usersignup")
public class UserSignup {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int usid;
	private String username;
	private String usemail;
	private String uspassword;
	@Override
	public String toString() {
		return "UserSignup [usid=" + usid + ", username=" + username + ", usemail=" + usemail + ", uspassword="
				+ uspassword + "]";
	}
	public int getUsid() {
		return usid;
	}
	public void setUsid(int usid) {
		this.usid = usid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsemail() {
		return usemail;
	}
	public void setUsemail(String usemail) {
		this.usemail = usemail;
	}
	public String getUspassword() {
		return uspassword;
	}
	public void setUspassword(String uspassword) {
		this.uspassword = uspassword;
	}
	

}
