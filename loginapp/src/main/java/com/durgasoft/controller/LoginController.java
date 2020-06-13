package com.durgasoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController 
{
  @RequestMapping(value="/loginpage", method=RequestMethod.GET)
  public String showLoginPage() {
	  return "loginform";
  }
 @RequestMapping(value="/login", method=RequestMethod.POST)
public String login(@RequestParam String uname, @RequestParam String upwd,ModelMap map) {
	map.addAttribute("username", uname);
	String status="";
	if (uname.equals("durga") && upwd.equals("durga")) {
		status="success";
	}
	else {
		status="failure";
}
	return status;

}
}