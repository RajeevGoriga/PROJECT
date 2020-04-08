package com.cognizant.EmployeeManagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.EmployeeManagement.dao.EmployeeDAO;
import com.cognizant.EmployeeManagement.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDao;
	
	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		
		return employeeDao.getAllEmployees();
	}

	@Override
	@Transactional
	public void saveEmployee(Employee emp) {
		employeeDao.saveEmployee(emp);
		
	}

	@Override
	@Transactional
	public Employee getEmployee(int id) {
		return employeeDao.getEmployee(id);
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
	}

}