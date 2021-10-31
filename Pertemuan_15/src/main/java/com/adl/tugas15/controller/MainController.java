package com.adl.tugas15.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/index")
	public String showIndex() {
		return "html/index";
	}
	
	

}
