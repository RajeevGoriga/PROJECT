package com.cognizant.EventManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.EventManagement.entity.Admin;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {
  @RequestMapping("/")
  public String displayWelcomePage(){
  	return "index" ;
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
