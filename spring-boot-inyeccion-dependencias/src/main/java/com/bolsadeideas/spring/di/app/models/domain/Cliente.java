package com.bolsadeideas.spring.di.app.models.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cliente {
	
	@Value("${cliente.nombre}")
	private String nombre;
	
	@Value("${cliente.apellido}")
	private String apelliddo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelliddo() {
		return apelliddo;
	}

	public void setApelliddo(String apelliddo) {
		this.apelliddo = apelliddo;
	}

}