package com.example.springboot.webapp.myfirstweb.login;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	//@ResponseBody
	public String gotoWelcomePage(ModelMap model)
	{	
		model.put("name", getLoggedinUsername());		
		return "Welcome";
	}
	
	private String getLoggedinUsername()
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}
