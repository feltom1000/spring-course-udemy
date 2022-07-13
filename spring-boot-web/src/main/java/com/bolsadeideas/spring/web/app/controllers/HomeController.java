package com.bolsadeideas.spring.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "forward:/app/index";
	}
	
	//para ir a google x ejemplo (pagina externa) debería usar redirect, no forward
	
	

}
