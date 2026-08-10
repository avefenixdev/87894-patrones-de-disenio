package ar.com.educacionit.factory_method.granja.entidades;

import ar.com.educacionit.factory_method.granja.interfaces.Animal;

public class GranjaFactory {
	
	public Animal crearAnimal(String tipoDeAnimal) {
		
		switch (tipoDeAnimal) {
		case "GATO": {
			return new Gato();
		}
		case "PERRO": {
			return new Perro();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipoDeAnimal);
		}
		
	}

}
