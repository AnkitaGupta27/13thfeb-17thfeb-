package mvcspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Recontroller {

	@RequestMapping("/one")
	public String one() {
		System.out.println("This is one");
		return "redirect:/enjoy";
	}
	
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("This is two method");
		return "redirect:/contact";
	}
}
