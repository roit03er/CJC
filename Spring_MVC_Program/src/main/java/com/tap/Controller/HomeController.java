package com.tap.Controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("Controller is createds");

	}

	@RequestMapping("/first")
	public String first() {
		return "first.jsp";
	}
}
