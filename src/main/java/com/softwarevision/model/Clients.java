package com.softwarevision.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})

@Entity
public class Clients {
	// "Clients" Table fields.
	
	// Making ClientID autogenerate
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ClientID;
	
	private String FirstName;
	private String LastName;
	private int Phone;
	private int CellPhone;
	private String Address;
	private String Gender;
	private String Password;
	private String Email;
	
	// Generating Getters and Setters
	public Long getClientID() {
		return ClientID;
	}
	public void setClientID(Long clientID) {
		this.ClientID = clientID;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		this.Phone = phone;
	}
	
	public int getCellPhone() {
		return CellPhone;
	}
	public void setCellPhone(int cellPhone) {
		this.CellPhone = cellPhone;
	}
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		this.Gender = gender;
	}
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
}
