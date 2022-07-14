package com.bolsadeideas.spring.di.app.models.services;

import org.springframework.stereotype.Service;

@Service("miServicioComplejo")
public class MiServicioComplejo implements IServicio {
	
	@Override
	public String operacion() {
		return "Ejecuntando algun proceso importante complicado";
	}

}
