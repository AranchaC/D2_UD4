package com.example.demo;

import java.time.LocalDate;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Persona {
    
	@NotEmpty
	private String nombre;
	
	@NotEmpty
    private String apellido1;
    private String apellido2;
    
    @NotNull
    @Max(2005)
    private int anyoNac;
    
	@Pattern(regexp = ".*@.*\\.(com|es)$")
    private String email;
    
    @NotNull
    @Size(min=5, max=10)
    private String contrasena;
    private String sexo;
    
    @NotNull
    @Size(min=8)
    private String direccion;   
    private String estudios;
    
    @NotEmpty
    @Size(min=2, max=4)
    private String[] temas;
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEstudios() {
		return estudios;
	}
	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
	public String[] getTemas() {
		return temas;
	}
	public void setTemas(String[] temas) {
		this.temas = temas;
	}
    public int getAnyoNac() {
		return anyoNac;
	}
	public void setAnyoNac(int anyoNac) {
		this.anyoNac = anyoNac;
	}
    // Constructor que inicializa el array temas
    public Persona() {
        this.temas = new String[]{};
    }
    
    
}
