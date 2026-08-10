package ar.com.educacionit.patrones.template_method.pasarela;

public class TarjetaCredito extends Pago {

	@Override
	protected void validarCliente() {
		System.out.println("Pedir el DNI");
		System.out.println("Comprobar si el nombre y apellido coincide con el nombre del plástico");
		
	}

	@Override
	protected void realizarPago(double monto) {
		System.out.println("Se genera el debito de la cuenta del cliente");
		
	}

	@Override
	protected void crearFactura(double monto) {
		System.out.println("Creando la factura por un monto de " + monto);
		
	}

	

}
