package ar.com.educacionit.factory_method.granja.entidades;

import ar.com.educacionit.factory_method.granja.interfaces.Animal;

public class Oveja implements Animal {

	@Override
	public void emitirSonido() {
		System.out.println("Meeeehhhh meeeehhh");
	}

}
