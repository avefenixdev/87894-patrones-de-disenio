package ar.com.educacionit.decorador.notificador.entidades;

import ar.com.educacionit.decorador.notificador.interfaces.Notificador;

// Decorador Concreto
public class NotificadorTikTok extends NotificadorDecorador {

	public NotificadorTikTok(Notificador envoltura) {
		super(envoltura);
	}

	@Override
	public void enviar(String mensaje) {
		super.enviar(mensaje); // enviar del padre -> Se envío por correo
		System.out.println("Enviando por TikTok " + mensaje);
	}
	
	

}
