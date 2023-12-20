package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IMCcontroller {

    @GetMapping("/calcularIMC")
    public String mostrarFormulario(Model model) {
    	//agrego atributo/valor de datos al modelo:
        model.addAttribute("datos", new Datos());
        return "formulario";
    }
    
    @PostMapping("/calcularIMC")
    public String calcularBMI(@ModelAttribute Datos datos, Model model) {
        // Realizar el cálculo del IMC:
        double imc = datos.getPeso() / (datos.getAltura()* datos.getAltura());
        //Determino clasificación llamando a la función:
        String clasificacion = obtenerClasificacion(imc, datos.getSexo());

        // Agregar resultados al modelo
        model.addAttribute("imc", imc);
        model.addAttribute("clasificacion", clasificacion);

        return "resultado";
    }
    
    private String obtenerClasificacion(double imc, String sexo) {
    	if ("mujer".equalsIgnoreCase(sexo)) {
    		if (imc > 9 && imc < 14) {
    			return "Grasa esencial";
    		} else if (imc > 13 && imc < 21) {
    			return "Atletas";
    		} else if (imc > 20 && imc < 25) {
    			return "Fitness";
    		} else if (imc > 24 && imc < 32) {
    			return "Aceptable";
    		} else if (imc > 32) {
    			return "Sobrepeso";
    		}  		
    	}//ifMujer
    	
    	if ("hombre".equalsIgnoreCase(sexo)) {
    		if (imc > 1 && imc < 6) {
    			return "Grasa esencial";
    		} else if (imc > 5 && imc < 14) {
    			return "Atletas";
    		} else if (imc > 13 && imc < 18) {
    			return "Fitness";
    		} else if (imc > 17 && imc < 25) {
    			return "Aceptable";
    		} else if (imc > 25) {
    			return "Sobrepeso";
    		}
    	}//ifHombre
		return "No disponible";
    }
}
