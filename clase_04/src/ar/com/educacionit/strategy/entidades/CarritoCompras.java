package ar.com.educacionit.strategy.entidades;

import ar.com.educacionit.strategy.interfaces.PagoEstrategia;

// El contexto que tiene la referencia a la estrategia

public class CarritoCompras {
	
	private PagoEstrategia estrategia;
	
	
	public void setMetodoPagoEstrategia(PagoEstrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public void checkout(int monto) {
		estrategia.pagar(monto);
	}

}
