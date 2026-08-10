package ar.com.educacionit.decorador.notificador.entidades;

import ar.com.educacionit.decorador.notificador.interfaces.Notificador;

// Clase decoradora concreta
public class NotificadorWhatsApp extends NotificadorDecorador {

	public NotificadorWhatsApp(Notificador envoltura) {
		super(envoltura);
	}

	@Override
	public void enviar(String mensaje) {
		super.enviar(mensaje);
		System.out.println("Enviando por WhatsApp: " + mensaje);
	}
	
}
