package ar.com.educacionit.factory_method.granja.entidades;

import ar.com.educacionit.factory_method.granja.interfaces.Animal;

public class Perro implements Animal {

	@Override
	public void emitirSonido() {
		System.out.println("Guauuuuu guauuuuuu");
	}

}
