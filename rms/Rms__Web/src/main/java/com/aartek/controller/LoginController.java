package com.aartek.controller;

 
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aartek.model.LoginModel;
import com.aartek.service.LoginService;
import com.aartek.validator.LoginValidator;

@Controller
public class LoginController 
{
	
	 
	 @Autowired
	  LoginService loginService;
	 @Autowired
	  LoginValidator lvalidate;
 	@RequestMapping("/login")
	public String showLogin(Model m)
	{   m.addAttribute("LoginModel", new LoginModel());
		return "login";
		
	}
	 @RequestMapping(value = "/loginuser", method = RequestMethod.POST)
	    public ModelAndView showLoginMapping(@ModelAttribute("LoginModel") LoginModel login1,BindingResult result) {
		 
		 lvalidate.validate(login1, result);
		 if(result.hasErrors())
		 {
			 return  new ModelAndView("login") ;
		 }
         System.out.println(login1.getUsername());
        System.out.println(login1.getPassword());
        loginService.validateservice(login1);
         return  new ModelAndView("welcome");
}}