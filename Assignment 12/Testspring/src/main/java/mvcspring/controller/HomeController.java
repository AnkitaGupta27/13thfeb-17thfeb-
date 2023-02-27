package mvcspring.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/home")
	public String home(Model model) {
    	System.out.println("this is index.jsp");
    	model.addAttribute("name","Mujeeb Ahmad Tarry");
    	model.addAttribute("id",8873);
    	List<String> friends=new ArrayList<String>();
    	friends.add("Mujeeb");
    	friends.add("Fazil");
    	friends.add("Basit");
    	model.addAttribute("f",friends);
    	
		return "index";	
		}
    @RequestMapping("/about")
    public String about() {
    	System.out.println("This is in about");
    	return "about";
    }
    @RequestMapping("/help")
    public ModelAndView help() {
    	System.out.println("this is  help controller");
    	ModelAndView model=new ModelAndView();
    	model.addObject("name", "Mujeeb Tarry");
    	model.addObject("id", 6757);
    	
    LocalDateTime now =LocalDateTime.now();
    model.addObject("Date", now);
    
    List<Integer> list= new ArrayList<>();
    list.add(9589);
    list.add(8748);
    list.add(7394);
    list.add(7847);
    model.addObject("list", list);
    
    	model.setViewName("/help");
    	return model;
    	
    }
}
