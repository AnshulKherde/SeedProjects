package com.seed.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="partner")
public class EventBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String company_emp_first_name;
	@Column
	private String company_emp_last_name;
	@Column
	private String company_name;
	@Column
	private String email_id;
	@Column
	private String phone_number;
	@Column
	private String address;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String country;
	@Column
	private String event_type;
	@Column
	private String event_name;
	@Column
	private String bank_acc_no;
	@Column
	private String venue;
	@Column
	private String img;
	@Column
	private String descrip;
	@Column
	private String price;
	@Column
	private String eventdate;
	@Column
	private String time;
	
	public EventBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EventBook(int id, String company_emp_first_name, String company_emp_last_name, String company_name,
			String email_id, String phone_number, String address, String city, String state, String country,
			String event_type, String event_name, String bank_acc_no, String venue, String img, String descrip,
			String price, String date, String time) {
		super();
		this.id = id;
		this.company_emp_first_name = company_emp_first_name;
		this.company_emp_last_name = company_emp_last_name;
		this.company_name = company_name;
		this.email_id = email_id;
		this.phone_number = phone_number;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.event_type = event_type;
		this.event_name = event_name;
		this.bank_acc_no = bank_acc_no;
		this.venue = venue;
		this.img = img;
		this.descrip = descrip;
		this.price = price;
		this.eventdate = date;
		this.time = time;
	}
	@Override
	public String toString() {
		return "EventBook [id=" + id + ", company_emp_first_name=" + company_emp_first_name + ", company_emp_last_name="
				+ company_emp_last_name + ", company_name=" + company_name + ", email_id=" + email_id
				+ ", phone_number=" + phone_number + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", event_type=" + event_type + ", event_name=" + event_name
				+ ", bank_acc_no=" + bank_acc_no + ", venue=" + venue + ", img=" + img + ", descrip=" + descrip
				+ ", price=" + price + ", date=" + eventdate + ", time=" + time + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany_emp_first_name() {
		return company_emp_first_name;
	}
	public void setCompany_emp_first_name(String company_emp_first_name) {
		this.company_emp_first_name = company_emp_first_name;
	}
	public String getCompany_emp_last_name() {
		return company_emp_last_name;
	}
	public void setCompany_emp_last_name(String company_emp_last_name) {
		this.company_emp_last_name = company_emp_last_name;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEvent_type() {
		return event_type;
	}
	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getBank_acc_no() {
		return bank_acc_no;
	}
	public void setBank_acc_no(String bank_acc_no) {
		this.bank_acc_no = bank_acc_no;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDate() {
		return eventdate;
	}
	public void setDate(String date) {
		this.eventdate = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getEventdate() {
		return eventdate;
	}
	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}
	
	

}
