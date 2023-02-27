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
    	m.addAttribute("title","This is Registration Page");
		m.addAttribute("desc","created By Mujeeb Tarry");
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
		model.addAttribute("msg", "User has been added with id "+createUser);
		return "success";
		
	}
	
	
	
	
	
	
	
	
	
	

	/*
	 * @RequestMapping(path="/processform" ,method = RequestMethod.POST) public
	 * String helper(@RequestParam("email")String email,
	 * 
	 * @RequestParam("username")String Username,
	 * 
	 * @RequestParam("password")String password, Model model) { User user=new
	 * User(); user.setEmail(email); user.setUsername(Username);
	 * user.setPassword(password);
	 * 
	 * System.out.println(user);
	 * 
	 * 
	 * model.addAttribute("Email",email); model.addAttribute("username", Username);
	 * model.addAttribute("Password", password);
	 * 
	 * 
	 * model.addAttribute("user" ,user); return "success";
	 * 
	 * }
	 */
}
