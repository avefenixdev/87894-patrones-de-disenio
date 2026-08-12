package ar.com.educacionit.observer.entidades;

import ar.com.educacionit.observer.interfaces.Suscriptor;

public class Usuario implements Suscriptor {
	
	private String nombre;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void notificar(String video) {
		System.out.println(this.nombre + " recibió la notificación: " + video);
	}

}
