package ar.com.educacionit.patrones.decorator.cafeteria;

import ar.com.educacionit.patrones.decorator.cafeteria.interfaces.Bebida;

public class ConChocolateDecorador extends BebidaDecorador {

	
	public ConChocolateDecorador(Bebida bebida) {
		super(bebida);
	}

	@Override
	public String getDescripcion() {
		return bebida.getDescripcion() + ", con chocolate";
	}

	@Override
	public double getCosto() {
		return bebida.getCosto() + 2.0;
	}

}
