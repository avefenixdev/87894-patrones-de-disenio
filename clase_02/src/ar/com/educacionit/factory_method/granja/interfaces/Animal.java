package ar.com.educacionit.factory_method.granja.interfaces;

public interface Animal {
	// todos los animales van a tener que respetar este contrato. 
	// Todas las clases que implementen Animal van a estar obligadas a 
	// sobreescribir los métods que figuren en la interfaz
	
	void emitirSonido();
}
