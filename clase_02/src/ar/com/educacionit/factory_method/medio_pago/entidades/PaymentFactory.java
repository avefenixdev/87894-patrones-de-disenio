package ar.com.educacionit.factory_method.medio_pago.entidades;

import ar.com.educacionit.factory_method.medio_pago.enumerados.MediosPago;
import ar.com.educacionit.factory_method.medio_pago.interfaces.Payment;

public class PaymentFactory {
	
	public Payment createPayment(MediosPago payment) {
		switch (payment) {
		case CARD: {
			return new CardPayment();
		}
		case CRYPTO: {
			return new CryptoPayment();
		}
		case PAYPAL: {
			return new PayPalPayment();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + payment);
		}
	}

}
