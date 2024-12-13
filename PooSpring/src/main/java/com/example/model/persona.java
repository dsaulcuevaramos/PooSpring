package com.example.model;

public class persona {
	private String nombre;
	private String telef;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelef() {
		return telef;
	}

	public void setTelef(String telef) {
		this.telef = telef;
	}

	public persona() {
		super();
	}

	public persona(String nombre, String telef) {
		super();
		this.nombre = nombre;
		this.telef = telef;
	}

}
