package com.bolsadeideas.spring.di.app.models.services;

import org.springframework.stereotype.Service;

@Service("miServicioSimple")
public class MiServicio implements IServicio {
	
	@Override
	public String operacion() {
		return "Ejecuntando algun proceso importante de CRUD";
	}

}
