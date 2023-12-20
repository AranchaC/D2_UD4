package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorFormulario {
	
	@GetMapping("/saludo")
	public String saludo(Model modelo) {
		modelo.addAttribute("saludo", new Saludo());
		return "saludo";
		
	}

}
