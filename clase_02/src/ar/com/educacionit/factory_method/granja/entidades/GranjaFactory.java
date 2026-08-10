package ar.com.educacionit.factory_method.granja.entidades;

import ar.com.educacionit.factory_method.granja.enumerados.TipoAnimal;
import ar.com.educacionit.factory_method.granja.interfaces.Animal;

public class GranjaFactory {
	
	public Animal crearAnimal(TipoAnimal tipoDeAnimal) {
		
		switch (tipoDeAnimal) {
		case GATO: {
			return new Gato();
		}
		case PERRO: {
			return new Perro();
		}
		case VACA: {
			return new Vaca();
		}
		case OVEJA: {
			return new Oveja();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipoDeAnimal);
		}
		
	}

}
