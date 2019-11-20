package com.ipartek.exceptions;

import java.io.IOException;

public class ExcepcionListaNegra extends Exception{
	
	public int codigoError;

	public ExcepcionListaNegra(int codigoError) {
		super();
		this.codigoError = codigoError;
	}
	
	@Override
	public String getMessage() {
		
		String mensajeError = "";
		
		switch (this.codigoError) {
		case 1:
			mensajeError = "Persona demasiado baja (altura menor de 1.60m)";
			break;
		case 2:
			mensajeError = "Persona demasiado alta (altura mayor de 2.10m)";
			break;
		case 3:
			mensajeError = "Persona en exceso delgada (peso inferior a 35kg)";
			break;
		case 4:
			mensajeError = "Persona en exceso obesa (peso superior a 160kg)";
			break;
		case 5:
			mensajeError = "Persona con los pies planos";
			break;
		case 6:
			mensajeError = "Persona con problemas serios de visión (visión de 20/160+)";
			break;			
		default:
			break;
		}

		return mensajeError;
	}

}
