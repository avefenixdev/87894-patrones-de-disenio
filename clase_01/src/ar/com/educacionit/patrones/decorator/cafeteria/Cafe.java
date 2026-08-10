package ar.com.educacionit.patrones.decorator.cafeteria;

import ar.com.educacionit.patrones.decorator.cafeteria.interfaces.Bebida;

// Clase Base
public class Cafe implements Bebida {

	@Override
	public String getDescripcion() {
		return "Café";
	}

	@Override
	public double getCosto() {
		return 7.0;
	}

}
