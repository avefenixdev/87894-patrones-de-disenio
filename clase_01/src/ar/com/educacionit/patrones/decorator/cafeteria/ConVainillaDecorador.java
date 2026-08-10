package ar.com.educacionit.patrones.decorator.cafeteria;

import ar.com.educacionit.patrones.decorator.cafeteria.interfaces.Bebida;

public class ConVainillaDecorador extends BebidaDecorador {
	

	public ConVainillaDecorador(Bebida bebida) {
		super(bebida);
	}

	@Override
	public String getDescripcion() {
		return bebida.getDescripcion() + ", con vainilla";
	}

	@Override
	public double getCosto() {
		return bebida.getCosto() + 1.0;
	}

}
