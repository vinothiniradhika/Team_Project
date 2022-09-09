package com.saloon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shoplogin")
public class ShopLogin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int slid;
	private String semail;
	private String spassword;
	@Override
	public String toString() {
		return "ShopLogin [slid=" + slid + ", semail=" + semail + ", spassword=" + spassword + "]";
	}
	public int getSlid() {
		return slid;
	}
	public void setSlid(int slid) {
		this.slid = slid;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
}