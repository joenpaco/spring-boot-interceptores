package com.joenpaco.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {
	
	@GetMapping(value = {"/inicio"})
	public String inicio(Model model) {
		
		return "index";
		
	}

}
