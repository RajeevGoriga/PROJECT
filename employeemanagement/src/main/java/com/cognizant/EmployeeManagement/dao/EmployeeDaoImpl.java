package com.cognizant.EmployeeManagement.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.EmployeeManagement.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {

	@Autowired
	SessionFactory factory;

	@Override
	public List<Employee> getAllEmployees()
	{
	    Session session =factory.getCurrentSession();
	    Query<Employee> query =session.createQuery("from Employee",Employee.class);
	    List<Employee> empList=query.getResultList();
	    return empList;
	}

	@Override
	public void saveEmployee(Employee emp) 
	{
		Session session =factory.getCurrentSession();
		session.saveOrUpdate(emp);
		System.out.println(emp);
	}

	@Override
	public Employee getEmployee(int id) 
	{
		Session session =factory.getCurrentSession();
		Employee employee=session.get(Employee.class, id);
		return employee;
	}

	@Override
	public void deleteEmployee(int id) 
	{
		Session session =factory.getCurrentSession();
		Employee em=session.get(Employee.class, id);
		session.delete(em);
		System.out.println("Deleted!");
	}
}