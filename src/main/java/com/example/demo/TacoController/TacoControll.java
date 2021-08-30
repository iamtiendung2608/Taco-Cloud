package com.example.demo.TacoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TacoControll {
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
