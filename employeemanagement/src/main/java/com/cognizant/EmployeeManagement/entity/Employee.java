package com.cognizant.EmployeeManagement.entity;

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
@Table(name="employee_management")
public class Employee {
	@Id
	@Column(name="employee_id")
    private int id;
	
	@Column(name="firstName")
	@NotEmpty(message="firstName cannot be null")
    private String firstName;
	
	@Column(name="lastName")
	@NotEmpty(message="lastName cannot be null")
    private String lastName;
	
	@Column(name="mail_id")
	@Email(message="email should be valid")
    private String email;
	
	@Column(name="contact_number")
	@NotEmpty(message="contact number cannot be null")
	@Pattern(regexp="(^$|[0-9]{10})",message="Enter 10 digit mobile number")
	private String contact;
	
	@Column(name="gender")
	@NotEmpty(message="gender cannot be null")
	private String gender;
	
	@Column(name="age")
	@NotEmpty(message="age cannot be null")
	private String age;
	
	@Column(name="job_location")
	@NotEmpty(message="location cannot be null")
	private String location;
	
	@Column(name="Business_Unit")
	@NotEmpty(message="business unit cannot be null")
	private  String bu;
	
	@Column(name="project_id")
    private  int projectId;
	
	@Column(name="Job_title")
	@NotEmpty(message="job_title cannot be null")
	private String job_title;
	
	@Column(name="DateOfJoining")
	@NotNull
	private  Date doj;
	
	@Column(name="Salary")
	@Min(message="salary minimum value is 1000",value=1000)
	private double salary;
   
	public Employee() {}
	public Employee(int id,String firstName, String lastName, String email, String contact, String gender, String age,
			String location, String bu, int projectId, String job_title, Date doj, double salary) {
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.age = age;
		this.location = location;
		this.bu = bu;
		this.projectId = projectId;
		this.job_title = job_title;
		this.doj = doj;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", contact=" + contact + ", gender=" + gender + ", age=" + age + ", location=" + location + ", bu="
				+ bu + ", projectId=" + projectId + ", job_title=" + job_title + ", doj=" + doj + ", salary=" + salary
				+ "]";
	}
    
}