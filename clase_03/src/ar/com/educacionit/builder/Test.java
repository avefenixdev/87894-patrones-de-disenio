package ar.com.educacionit.builder;

import ar.com.educacionit.builder.entidades.Usuario;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 03 - Patrón Builder");
		
		// Patrón Builder
		
		// https://refactoring.guru/es/design-patterns/builder
		
		// Patrón Builder (Creacional)
		// Lo que queremos evitar con este patrón son los constructres 
		// con múltples parametros.
		// Construir un objeto paso a paso de forma legible, 
		// controlada para obtener un objeto completo.
		
		// Usuario usuario = new Usuario("Maximiliano", "Principe", "15-5555-8568", 22, "max@gmail.com");
		
		Usuario u = new Usuario.Builder("Maxi", "maxi@gmail.com")
									.edad((byte) 22)
									.telefono("11-3333-4444")
									.apellido("Principe")
									.build();
		
		System.out.println(u); // toString()
		
		
	}

}
