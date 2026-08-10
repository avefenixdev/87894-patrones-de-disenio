package ar.com.educacionit.decorador.notificador;

import ar.com.educacionit.decorador.notificador.entidades.*;
import ar.com.educacionit.decorador.notificador.interfaces.Notificador;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Clase 02 - Decorador");
		
		// Repaso de Decorador
		
		// Clase base
		
		Notificador ne = new NotificadorEmail();
		
		ne.enviar("Bienvenido a nuestro newsletter");
		
		System.out.println("-------------------------------------");
		
		// Decorando la clase base con NotificadorTikTok
		
		Notificador ntt = new NotificadorTikTok(ne); // por email + TikTok
		
		ntt.enviar("Bienvenido a nuestro newsletter");
		
		System.out.println("-------------------------------------");
		
		Notificador n = new NotificadorTikTok(new NotificadorEmail());
		
		n.enviar("Bienvenido a nuestra comunidad");
		
	}

}
