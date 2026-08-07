package ar.com.educacionit.patrones.singleton;

import ar.com.educacionit.patrones.singleton.entidades.Logger;

public class Main {

	public static void main(String[] args) {
		System.out.println("Clase 01 - Patrones de Disenio");
		
		// Patrón Singleton
		// Sirve para garantizar que exista una sola instancia de una clase en toda la aplicación. 
		// Un único punto de acceso
		
		// Ejemplo
		// 1. Configuración global de la aplicación
		// 2. Logger
		// 3. Conexiones a base de datos
		// 4. Cache compartida
		
		Logger logger = Logger.getInstancia();
		logger.log("Este es mi primer log");
		System.out.println(logger.hashCode());
		
		Logger logger2 = Logger.getInstancia();
		logger2.log("Segundo log");
		System.out.println(logger2.hashCode());
		
		Logger logger3 = Logger.getInstancia();
		logger3.log("Tercer log");
		System.out.println(logger3.hashCode());

		// Una sola instancia
		// Control total sobre la creación
		// Acceso controlado y central
		// Constructor privado.
		
		
					

	}

}
