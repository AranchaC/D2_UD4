package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.validation.Valid;

@Controller
public class RevistaController implements WebMvcConfigurer {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/registroOK").setViewName("registroOK");
	}
	
	@GetMapping("/registroRevista")
	public String mostrarFormRegistro(Model model) {
		model.addAttribute("persona", new Persona());
		return "formRegistro";
	}
	
	@PostMapping("/registroRevista")
	public String registroCorrecto(@Valid @ModelAttribute("persona") 
		Persona persona, 
			BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "formRegistro";
		}
		
		model.addAttribute("persona", persona);

		return "redirect:/registroOK";
	}

}
