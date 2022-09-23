package com.saloon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usersignup")
public class UserSignup {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="us_seq")
	@Column(name="usid",nullable=false)
	private long usid;
	private String firstname;
	private String lastname;
	private String usemail;
	private String uspassword;
	
	public UserSignup(long usid, String firstname, String lastname, String usemail, String uspassword) {
		super();
		this.usid = usid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.usemail = usemail;
		this.uspassword = uspassword;
	}

	public long getUsid() {
		return usid;
	}

	public void setUsid(long usid) {
		this.usid = usid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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
