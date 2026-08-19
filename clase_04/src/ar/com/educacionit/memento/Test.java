package ar.com.educacionit.memento;

import ar.com.educacionit.memento.entidades.GestorPartidas;
import ar.com.educacionit.memento.entidades.Jugador;

public class Test {

	public static void main(String[] args) {
		System.out.println("Patrón Memento");
		
		// https://refactoring.guru/es/design-patterns/memento
		// Patrón Memento (Patrón Comportamiento)
		// Sirve para guardar y restaurar el estado interno de un objeto sin violar la encapsulación.
		// GestorPartidas (Caretaker) -> gestor de checkpoints (Cuidador) administra los checkpoints sin modificar su contenido
		// Jugador (Originador) -> crear y restaura estados
		// Memento (interfaz) // Contrato del memento (Representa el estado guardado)
		// MementoConcreto (Memento) -> almacena nivel y vida
		
		Jugador jugador = new Jugador("Nivel 1", 100);
		
		GestorPartidas gestor = new GestorPartidas();
		
		// Guardo progreso
		
		gestor.add(jugador.guardar()); // Nivel 1 | 100 | 0
		
		jugador.setEstado("Nivel 2", 75);
		
		System.out.println("Avanzo: " + jugador);
		
		// Guardo el progreso
		
		gestor.add(jugador.guardar()); // Nivel 2 -> 75 | 1
		
		jugador.setEstado("Nivel 3", 50);
		
		System.out.println("Avanzó: " + jugador);
		
		// Guardo el progreso

		gestor.add(jugador.guardar()); // Nivel 3 -> 50 | 2
		
		// Restaurar al nivel 1
		
		jugador.restaurar(gestor.get(0));
		
		System.out.println("Restauración: " + jugador);
		
		jugador.setEstado("Nivel 2", 97);
		
		System.out.println("Volví a pasar el nivel 2, mucho mejor: " + jugador);
		
		gestor.add(jugador.guardar()); // Nivel 2 -> 97 | 3
		
		jugador.setEstado("Nivel 3", 45);
		
		gestor.add(jugador.guardar()); // Nivel 3 -> 45 | 4
		
		System.out.println("Avancé nivel 3 -> " + jugador);
		
		jugador.restaurar(gestor.get(3));
		
		System.out.println("Avancé nivel 2 -> " + jugador);
		
		jugador.setEstado("Nivel 3", 97);
		
		System.out.println("Avancé nivel 3 -> modo crack -> " + jugador);
		
		gestor.add(jugador.guardar());
		
		System.out.println(gestor.getCheckPoints());
		
	}

}
