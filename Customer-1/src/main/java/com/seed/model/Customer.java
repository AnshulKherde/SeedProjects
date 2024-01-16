package com.seed.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name ="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int Id;
	@Column
	private String first_name;
	@Column
	private String last_name;
	@Column
	private String gender;
	@Column
	private String email_id;
	@Column
	private String password;
	@Column
	private String phone_number;
	@Column
	private String address_line1;
	@Column
	private String address_line2;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private int pin_code;
	@Column
	private String country;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String first_name, String last_name, String gender, String email_id, String password,
			String phone_number, String address_line1, String address_line2, String city, String state, int pin_code,
			String country) {
		super();
		Id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.email_id = email_id;
		this.password = password;
		this.phone_number = phone_number;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.state = state;
		this.pin_code = pin_code;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", first_name=" + first_name + ", last_name=" + last_name + ", gender=" + gender
				+ ", email_id=" + email_id + ", password=" + password + ", phone_number=" + phone_number
				+ ", address_line1=" + address_line1 + ", address_line2=" + address_line2 + ", city=" + city
				+ ", state=" + state + ", pin_code=" + pin_code + ", country=" + country + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress_line1() {
		return address_line1;
	}
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}
	public String getAddress_line2() {
		return address_line2;
	}
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin_code() {
		return pin_code;
	}
	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
