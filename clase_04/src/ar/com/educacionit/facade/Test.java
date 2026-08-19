package ar.com.educacionit.facade;

import java.io.IOException;
import java.util.List;

import ar.com.educacionit.facade.entidades.NioFacade;

public class Test {

	public static void main(String[] args) {
		// Patrón Fachada
		// https://refactoring.guru/es/design-patterns/facade
		
		// El patrón Facade (Fachada) es estructural. Promporciona una interfaz simple y
		// unificada para acceder a un conjunto de clasees o funcionalidades más complejas
		
		
		NioFacade archivo = new NioFacade("datos.txt");
		
		
		try {
			archivo.crearArchivoSiNoExiste();
			
			archivo.escribirLineas(List.of(
					"Java es un lenguaje orientado a objetos",
					"Facade es un patrón estructural",
					"Java utiliza la API NIO para trabajar con archivos",
					"Estamos aprendiendo patrones de diseño"
			));
			
			System.out.println("Líneas que contienen 'Java':");
			
			archivo.leerLineasContenidas("Java");
			
			archivo.copiarA("backups/datos.txt");
			
			archivo.borrar();
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
