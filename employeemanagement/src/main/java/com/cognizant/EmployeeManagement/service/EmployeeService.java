package com.cognizant.EmployeeManagement.service;

import java.util.List;

import com.cognizant.EmployeeManagement.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public void saveEmployee(Employee emp);
	public Employee getEmployee(int id);
	public void deleteEmployee(int id);
}