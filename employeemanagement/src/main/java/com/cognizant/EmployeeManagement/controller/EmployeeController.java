package com.cognizant.EmployeeManagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.cognizant.EmployeeManagement.entity.Employee;
import com.cognizant.EmployeeManagement.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
    EmployeeService employeeService;
    
	@GetMapping("/list")
    public String listEmployees(Model theModel)
    {
		List<Employee> employees= employeeService.getAllEmployees();
		theModel.addAttribute("employees",employees);
        employees.forEach(s -> System.out.println(s));
    	return "employee-list";
    }
	
    @GetMapping("/addEmployee")
	public String addEmployee(Model model) {
		Employee e1=new Employee();
		model.addAttribute("employee",e1);
		return "employee-add-form";
	}
    
    @PostMapping("/saveEmployee")
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee emp,BindingResult bind)
	{
    	if(bind.hasErrors())
    	{
    		System.out.println(bind);
    		return "employee-add-form";
    	}
    	else
    	{
    	   employeeService.saveEmployee(emp);
		   return "redirect:/employee/list";
    	}
	}
    
    @GetMapping("/updateEmployee")
    public String updateEmployee(@RequestParam("employeeId") int id,Model model)
	{
		Employee emp=employeeService.getEmployee(id);
		model.addAttribute("employee", emp);
		return "employee-update-form";
	}
    
    @GetMapping("/deleteEmployee")
	public String delete(@RequestParam("employeeId") int id)
	{
		employeeService.deleteEmployee(id);
		return "redirect:/employee/list";
	}
}