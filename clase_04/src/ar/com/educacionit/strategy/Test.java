package ar.com.educacionit.strategy;

import ar.com.educacionit.strategy.entidades.CarritoCompras;
import ar.com.educacionit.strategy.entidades.MercadoPagoEstrategia;
import ar.com.educacionit.strategy.entidades.TarjetaCreditoEstrategia;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 03 - Patrón Strategy");
		
		// Patrón Strategy (Patrón Comportamiento)
		// https://refactoring.guru/es/design-patterns/strategy
		// Nos permite tener varias formas de hacer lo mismo y poder cambiarlas
		// sin tocar el código que las usa.
		// Tenés que pagar algo (PAGAR)
		// Tarjeta de crédito (Estrategias Tarjeta crédito)
		// Efectivo (Estrategias Efectivo)
		// Transferencia (Estrategias Transferencia)
		
		
		System.out.println("Patrón Strategy");
		
		CarritoCompras carro = new CarritoCompras();
		
		MercadoPagoEstrategia estrategiaMercadoPago = new MercadoPagoEstrategia("max@gmail.com");
		
		carro.setMetodoPagoEstrategia(estrategiaMercadoPago);
		
		carro.checkout(500);
		
		TarjetaCreditoEstrategia estrategiaTarjetaCredito = new TarjetaCreditoEstrategia("3333-4444-5555-6666");
				
		carro.setMetodoPagoEstrategia(estrategiaTarjetaCredito);
		
		carro.checkout(800);
				

	}

}
