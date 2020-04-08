package com.cognizant.EmployeeManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.cognizant.EmployeeManagement.entity.Admin;

@Controller
public class HomeController {
  @RequestMapping("/")
  public String displayWelcomePage(){
  	return "welcome" ;
  }
  @RequestMapping("/success")
  public String login(@ModelAttribute("admin") Admin adm) {
	if((adm.getUsername().equals("admin")) &&(adm.getPassword().equals("admin123")))
      {
    	  return "redirect:/employee/list";
      }
    else
      {
    	  return "login-failed";
      }
	  
  }
}
