package ar.com.educacionit.decorador.notificador.entidades;

import ar.com.educacionit.decorador.notificador.interfaces.Notificador;

// Clase Base
public class NotificadorEmail implements Notificador {

	@Override
	public void enviar(String mensaje) {
		System.out.println("Enviando EMAIL: "+ mensaje);
	}

}
