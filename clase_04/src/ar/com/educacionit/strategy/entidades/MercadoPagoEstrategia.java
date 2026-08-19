package ar.com.educacionit.strategy.entidades;

import ar.com.educacionit.strategy.interfaces.PagoEstrategia;

public class MercadoPagoEstrategia implements PagoEstrategia {
	
	private String email;

	public MercadoPagoEstrategia(String email) {
		this.email = email;
	}

	@Override
	public void pagar(int monto) {
		System.out.println("Pagando con Mercado Pago (Cuenta: " + this.email + ") un total de: $" + monto);
	}

}
