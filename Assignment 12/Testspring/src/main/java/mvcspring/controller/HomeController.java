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
    	model.addAttribute("name","Ankita Gupta");
    	model.addAttribute("id",8873);
    	List<String> friends=new ArrayList<String>();
    	friends.add("Ankita");
    	friends.add("Shruti");
    	friends.add("Surbhi");
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
    	model.addObject("name", "Ankita Gupta");
    	model.addObject("id", 6757);
    	
    LocalDateTime now =LocalDateTime.now();
    model.addObject("Date", now);
    
    List<Integer> list= new ArrayList<>();
    list.add(5654);
    list.add(46333);
    list.add(5654643);
    list.add(643543543);
    model.addObject("list", list);
    
    	model.setViewName("/help");
    	return model;
    	
    }
}
