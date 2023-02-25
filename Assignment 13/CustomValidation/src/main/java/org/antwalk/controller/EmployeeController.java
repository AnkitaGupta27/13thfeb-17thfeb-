package org.antwalk.controller;

import javax.validation.Valid;


import org.antwalk.model.Employee;
import org.antwalk.model.NewEmployee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/")
	public String show(Model m)
	{
		m.addAttribute("empl",new NewEmployee());
		return "Form";
	}
	@RequestMapping("/userInformation")
	public String userinformation(@Valid @ModelAttribute("empl") NewEmployee emp,BindingResult bs)
	{
		if(bs.hasErrors())
		{
			return "Form";
		}
		else
		   return "userInformation";
	}
}
