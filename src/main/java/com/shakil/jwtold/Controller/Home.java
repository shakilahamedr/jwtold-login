package com.shakil.jwtold.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@GetMapping("/welcome")
	public String welcome() {
		String text = "Welcome";
		text+=" to your EMPLOYEE PORTAL ";
		return text;
	}
}
