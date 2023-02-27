package mvcspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mvcspring.model.User;
import mvcspring.service.UserService;

@Controller
public class contactcontroller {
	
	@Autowired
	private UserService userService;
    @ModelAttribute
	public void CommonModel(Model m) {
    	m.addAttribute("title","Registration Page");
		m.addAttribute("desc","created By Ankita Gupta");
	}
	@RequestMapping("/contact")
	public String show(Model m) {
	
		return "contact";
	}
	
	@RequestMapping(path="/processform" ,method = RequestMethod.POST)
	public String helper(@ModelAttribute User user, Model model)
	{    
		System.out.println(user);
		int createUser = this.userService.CreateUser(user);
		model.addAttribute("msg", "User with id "+createUser+"has been added ");
		return "success";
		
	}
	
	
	
	
	
	
	
	
	
	

}
