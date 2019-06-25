package com.softwarevision.model;

import javax.persistence.Column;
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
	@Column(name = "ClientID")
	private Long ClientID;
	
	@Column(name = "First_Name")
	private String firstName;
	
	@Column(name = "Last_Name")
	private String lastName;
	
	@Column(name = "Phone")
	private int Phone;
	
	@Column(name = "Cell_Phone")
	private int cellPhone;
	
	@Column(name = "Address")
	private String Address;
	
	@Column(name = "Gender")
	private String Gender;
	
	@Column(name = "Password")
	private String Password;
	
	@Column(name = "Email")
	private String Email;
	
	// Generating Getters and Setters
	public Long getClientID() {
		return ClientID;
	}
	public void setClientID(Long clientID) {
		this.ClientID = clientID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		this.Phone = phone;
	}
	
	public int getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(int cellPhone) {
		this.cellPhone = cellPhone;
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
