package org.benjamin.portfolio.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(path= {"/", "/home"})
	String home() {
		System.out.println("home...");
		return "/resources/index.html";
	}
	
}
