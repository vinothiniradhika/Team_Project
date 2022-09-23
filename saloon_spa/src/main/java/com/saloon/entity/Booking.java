package com.saloon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="book_seq")
	@Column(name="id",nullable=false)
	private long id;
	private String name;
	private String shopname;
	private String service;
	private String phone;
	private String email;
	private int age;
	private String gender;
	private String time;
	private String date;
	@Column(nullable=false ,  updatable=false)
	private String bookingCode;
	
	public Booking(long id, String name, String shopname, String service, String phone, String email, int age,
			String gender, String time, String date, String bookingCode) {
		super();
		this.id = id;
		this.name = name;
		this.shopname = shopname;
		this.service = service;
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.time = time;
		this.date = date;
		this.bookingCode = bookingCode;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookingCode() {
		return bookingCode;
	}
	public void setBookingCode(String bookingCode) {
		this.bookingCode = bookingCode;
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
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
