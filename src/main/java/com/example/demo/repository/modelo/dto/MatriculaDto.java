package com.example.demo.repository.modelo.dto;

public class MatriculaDto {

	
	public String cedula;
	public String nombre;
	public String cedulaProfesor;
	public String nombreHilo;
	
	public MatriculaDto() {
		
	}
	
	
	public MatriculaDto(String cedula, String nombre, String cedulaProfesor, String nombreHilo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.cedulaProfesor = cedulaProfesor;
		this.nombreHilo = nombreHilo;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedulaProfesor() {
		return cedulaProfesor;
	}
	public void setCedulaProfesor(String cedulaProfesor) {
		this.cedulaProfesor = cedulaProfesor;
	}
	public String getNombreHilo() {
		return nombreHilo;
	}
	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}
	
	
	
}
