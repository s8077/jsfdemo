package com.example.jsfdemo.domain;

import java.util.Date;


import javax.validation.constraints.Past;

import javax.validation.constraints.Size;

public class Person {
	
	private String Name = "";
	private String Title = "";
	private Date Rent = new Date();


	
	@Size(min = 2, max = 20)
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	

	
	@Size(min = 2)
	public String getTitle() {
		return Title;
	}
	public void setTitle(String Title) {
		this.Title = Title;
	}
	

	
	@Past
	public Date getRent() {
		return Rent;
	}
	public void setRent(Date Rent) {
		this.Rent = Rent;
	}
	

	

	
}
