package ar.com.educacionit.patrones.decorator.cafeteria;

import ar.com.educacionit.patrones.decorator.cafeteria.interfaces.Bebida;

// Decorador es abstracto y n unca se instancia
// Cuando tengo una clase abstracta, no necesita respetar el contrato

public abstract class BebidaDecorador implements Bebida {
	
	protected Bebida bebida; // Composición (Envolver un objeto dentro de otro

	// Constuctor
	public BebidaDecorador(Bebida bebida) {
		this.bebida = bebida;
	}	

}
