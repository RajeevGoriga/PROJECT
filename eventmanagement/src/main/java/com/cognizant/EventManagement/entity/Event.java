package com.cognizant.EventManagement.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="event_management")
public class Event {
	@Id
	@Column(name="event_id")
    private int id;
	
	@Column(name="eventName")
	@NotEmpty(message="firstName cannot be null")
    private String eventName;
	
	@Column(name="contact_number")
	@NotEmpty(message="contact number cannot be null")
	@Pattern(regexp="(^$|[0-9]{10})",message="Enter 10 digit mobile number")
	private String contact;
	
	@Column(name="event_location")
	@NotEmpty(message="location cannot be null")
	private String eventlocation;
	
	@Column(name="event_Unit")
	@NotEmpty(message="event unit cannot be null")
	private  String eu;
	
	@Column(name="event_title")
	@NotEmpty(message="event_title cannot be null")
	private String event_title;
	
	@Column(name="eventDate")
	@NotNull
	private  Date evd;
	
	@Column(name="amount")
	@Min(message="amount minimum value is 1000",value=1000)
	private double amount;
   
	public Event() {}
	public Event(int id,String eventName, String contact, String eventlocation, String eu,  String event_title, Date evd, double samount) 
	{
		this.id=id;
		this.eventName = eventName;
		this.contact = contact;
		this.eventlocation = eventlocation;
		this.eu = eu;
		this.event_title = event_title;
		this.evd = evd;
		this.amount = amount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEventlocation() {
		return eventlocation;
	}
	public void setEventlocation(String eventlocation) {
		this.eventlocation = eventlocation;
	}
	public String getEu() {
		return eu;
	}
	public void setEu(String eu) {
		this.eu = eu;
	}
	public String getEvent_title() {
		return event_title;
	}
	public void setEvent_title(String event_title) {
		this.event_title = event_title;
	}
	public Date getEvd() {
		return evd;
	}
	public void setEvd(Date evd) {
		this.evd = evd;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", eventName=" + eventName + ", contact=" + contact + ", eventlocation="
				+ eventlocation + ", eu=" + eu + ", event_title=" + event_title + ", evd=" + evd + ", amount=" + amount
				+ "]";
	}
	
    
}