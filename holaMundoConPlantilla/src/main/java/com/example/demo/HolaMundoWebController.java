package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HolaMundoWebController {
	
	@RequestMapping("/saludo")
	public String procesaHolaMundo(@RequestParam(name="nombre", required=false, 
		defaultValue="Mundo") String nombre, Model model) {
		
		model.addAttribute("nombre", nombre);
		return "holaMundo";
	}
}
