package mvcspring.controller;

import java.util.*;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import mvcspring.model.Valentine;
import mvcspring.service.ValentineService;

@Controller
public class ValentineController {
	@org.springframework.beans.factory.annotation.Autowired(required=true)
	private ValentineService vs;
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	@PostMapping("/valentine")
	public String valentine() {
			
	    	return "valentine";	
		}
	@GetMapping("/valentine")
	public String home1() {
	    	System.out.println("this is get mapping in valentine.jsp");
	    	return "valentine";	
	}
	@PostMapping("/submitGiftList")
	public String submit(HttpServletRequest request) {
		Valentine valentine = new Valentine();
    	System.out.println("this is post mapping in valentine.jsp");
    	valentine.setLocation(request.getParameter("location"));
    	valentine.setDate(request.getParameter("date"));
    	List<String> lis = new ArrayList<>();
    	for(String s:request.getParameterValues("gifts"))
    		lis.add(s);
    	valentine.setGifts(lis);
//   	vs.createValentine(valentine);
	    	System.out.println("this is submitgiftlist.jsp");
	    	return "submitGiftList";	
	}
}
