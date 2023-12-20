package com.example.demo;

public class Contacto {
	//MENSAJE DE PRUEBA SUBIDA GIT
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public Contacto(String n, String a, int e) {
		nombre = n;
		apellido = a;
		edad = e;
	}
	
	public Contacto() { }
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String texto) {
		this.nombre = texto;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String texto) {
		this.apellido = texto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
