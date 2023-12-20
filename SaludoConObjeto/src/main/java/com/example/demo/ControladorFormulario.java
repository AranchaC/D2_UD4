package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorFormulario {
	
	@GetMapping("/saludo")
	public String saludo(Model modelo) {
		modelo.addAttribute("saludo", new Saludo());
		return "saludo";
		
	}
	
	  @PostMapping("/saludo")
	  public String greetingSubmit(@ModelAttribute Saludo saludo, Model model) {
	    model.addAttribute("saludo", saludo);
	    return "resultado";
	  }

}
