package ar.com.educacionit.patrones.decorator.cafeteria.interfaces;

public interface Bebida {
	// En las interfaces se definen las reglas del contrato que se van a seguir 
	// en las clases que implementen la interfaz
	
	String getDescripcion();
	double getCosto();

}
