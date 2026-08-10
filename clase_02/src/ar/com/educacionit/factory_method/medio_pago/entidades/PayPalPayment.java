package ar.com.educacionit.factory_method.medio_pago.entidades;

import ar.com.educacionit.factory_method.medio_pago.interfaces.Payment;

public class PayPalPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Pagando $ " + amount + " con PayPal");

	}

}
