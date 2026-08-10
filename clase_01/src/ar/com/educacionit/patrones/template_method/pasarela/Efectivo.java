package ar.com.educacionit.patrones.template_method.pasarela;

public class Efectivo extends Pago {

	@Override
	protected void validarCliente() {
		System.out.println("Controlar si el comprador ya es cliente");
		System.out.println("Revisar los billetes y que no sean falsos");

	}

	@Override
	protected void realizarPago(double monto) {
		System.out.println("Recibir los billetes y contarlos...");

	}

	@Override
	protected void crearFactura(double monto) {
		System.out.println("No se hace la factura...");
	}

}
