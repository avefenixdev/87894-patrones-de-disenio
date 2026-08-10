package ar.com.educacionit.patrones.decorator;

import ar.com.educacionit.patrones.decorator.cafeteria.Cafe;
import ar.com.educacionit.patrones.decorator.cafeteria.ConChocolateDecorador;
import ar.com.educacionit.patrones.decorator.cafeteria.ConVainillaDecorador;

public class Main {

	public static void main(String[] args) {
		System.out.println("Patrón de diseño Decorator");
		
		// Singleton -> Creacionales -> (creación)
		// Template Method -> Comportamiento -> (algoritmo)
		// Decorator -> Estructural -> (interacción entre clases)
		
		// Patrón Decorador
		// Sirve para agregar funcionalidades a un objeto sin modificar el objeto base
		// La idea es envolver un objeto con otro objeto que le suma (funcionalidades) comportamientos
		
		// SIN EL PATRÓN
		// Tengo un Cafe (Cafe) 7.0
		// Tengo un café con chocolate (CafeConChocolate) 7.0 + 2.0 => 9.0
		// Tengo un café con leche (CafeConLeche)
		// Tengo un café con leche y azucar (CafeConLecheAzucar)
		
		// Con el patrón (El objeto base y los decoradores "implementan" la interfaz
		// Interfaz en común
		// Objeto base y los decoradores...
		
		Cafe c = new Cafe();
		
		System.out.println(c.getDescripcion()); // Café
		System.out.println(c.getCosto()); // 7.0
		
		ConChocolateDecorador ccd = new ConChocolateDecorador(c);

		System.out.println(ccd.getDescripcion()); // Café, con chocolate
		System.out.println(ccd.getCosto()); // 9.0
				
		ConVainillaDecorador cvd = new ConVainillaDecorador(c);
		System.out.println(cvd.getDescripcion()); // Café, con vainilla
		System.out.println(cvd.getCosto()); // 8.0
		
		ConVainillaDecorador conVainillaChocolate = new ConVainillaDecorador(ccd);
		
		System.out.println(conVainillaChocolate.getDescripcion()); // Café, con chocolate, con vainilla
		System.out.println(conVainillaChocolate.getCosto()); // 10.0
		
		
		
	}

}
