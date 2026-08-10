package ar.com.educacionit.factory_method.granja;

public class Test {

	public static void main(String[] args) {
		// Factory Method
		// https://refactoring.guru/es/design-patterns/factory-method
		
		// Factory Method
		// Es una forma ordenada de crear objetos sin acomplamiento que podría 
		// suceder en la creación de objetos a gran escala
		
		// Vamos a tener una clase fabrica para construir los objetos. Nosotros no los construimos,
		// llamamos a la fabrica y la fabrica se encarga de construir
		
		// if ( tipo === 'admin' ) {
		//	user = new AdminUser();
		// } else if ( tipo === 'normal' ) {
		// 	user = new NormalUser();
		// } else if ( tipo === 'invitado') {
		//	user = new InvitadoUser();
		// }
		
		// PROBLEMA
		// El código depende de clases concretas
		// Cada nuevo tipo romper el archivo existente
		// La lógica de negocio está mezclada con la lógica de creación
		
		// Cuando usar Factory Method
		// - Tenés varios objetos similares
		// - El tipo se decide en tiempo de ejecución
		// - Sabes que el sistema va a crecer

	}

}
