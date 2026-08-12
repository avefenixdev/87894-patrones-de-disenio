package ar.com.educacionit.observer;

import ar.com.educacionit.observer.entidades.CanalYoutube;
import ar.com.educacionit.observer.entidades.Usuario;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 03 - Patrón Observer");
		
		// https://refactoring.guru/es/design-patterns/observer
		
		// Patrón Observer (Patrón Comportamiento)
		// Una forma prolija, estructura y ordenada de avisar cambios sin andar preguntado 
		// todo el tiempo.
		// 1. Un objeto cambia
		// 2. otros objetos se enteran automaticamente.
		// 3. sin que el primero tenga que conocerlos uno por uno.
		
		// Patrón Canillita.
		
		CanalYoutube canal = new CanalYoutube();
		
		Usuario u1 = new Usuario("Georigina");
		Usuario u2 = new Usuario("Lorena");
		Usuario u3 = new Usuario("Lautaro");
		
		canal.suscribir(u1);
		canal.suscribir(u2);
		canal.suscribir(u3);
		
		canal.subirVideo("Patrón Observer explicado en menos de 1 segundo");
		
		Usuario u4 = new Usuario("Luis");
		
		canal.suscribir(u4);
		
		canal.subirVideo("Patrón Strategy explicado en menos de 500ms");

		canal.desuscribir(u1);
		
		canal.subirVideo("Patrón Singleton explicado en menos 100ms");
		
		
	}

}
