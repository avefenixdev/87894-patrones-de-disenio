package ar.com.educacionit.patrones.template_method.pasarela;

// Clase base -> Donde está el algoritmo -> Serie de pasos

// Es que una clase abstracta restringe la posibilidad de ser instanciada

public abstract class Pago {

	// Algoritmo --> Pasos
	public void procesarPago(double monto) {
		
		// 1. Validar al cliente
		validarCliente();
		// 1.1 Loguearse en la aplicación
		// 1.2 Registrarse
		// 2.Realizarel pago
		realizarPago(monto);
		// 3. Verificar el pago
		confirmarTransaccion();
		// 4. Crear Factura
		crearFactura(monto);
	}

	protected abstract void validarCliente();
	protected abstract void realizarPago(double monto);
	protected abstract void crearFactura(double monto);
	
	private void confirmarTransaccion() {
		System.out.println("Transacción confirmada!");
	}

}
