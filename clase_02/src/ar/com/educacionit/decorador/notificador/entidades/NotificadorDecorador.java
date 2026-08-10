package ar.com.educacionit.decorador.notificador.entidades;

import ar.com.educacionit.decorador.notificador.interfaces.Notificador;
// BASE DECORADOR -> Decorador Abstracto -> Me sirve como esqueleto para los decoradores concretos

public abstract class NotificadorDecorador implements Notificador {

	protected Notificador envoltura; // Composición
	
	public NotificadorDecorador(Notificador envoltura) {
		this.envoltura = envoltura; // Estamos teniendo una instancia dentro de la instancia que se va a crear
	}

	@Override
	public void enviar(String mensaje) {
		this.envoltura.enviar(mensaje);
	}

}
