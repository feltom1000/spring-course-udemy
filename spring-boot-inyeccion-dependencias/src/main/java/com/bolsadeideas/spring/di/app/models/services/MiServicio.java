package com.bolsadeideas.spring.di.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("miServicioSimple")
@Primary
public class MiServicio implements IServicio {
	
	@Override
	public String operacion() {
		return "Ejecuntando algun proceso importante SIMPLE";
	}

}
