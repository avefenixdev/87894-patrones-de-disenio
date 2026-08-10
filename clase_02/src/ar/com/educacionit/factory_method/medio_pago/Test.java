package ar.com.educacionit.factory_method.medio_pago;

import ar.com.educacionit.factory_method.medio_pago.entidades.PaymentFactory;
import ar.com.educacionit.factory_method.medio_pago.enumerados.MediosPago;
import ar.com.educacionit.factory_method.medio_pago.interfaces.Payment;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Factory Method -> Medio de pago");
		
		PaymentFactory pf = new PaymentFactory();
		
		Payment tc = pf.createPayment(MediosPago.CARD);
		tc.pay(222.3);
		
		Payment crypto = pf.createPayment(MediosPago.CRYPTO);
		crypto.pay(555.5);
		
		Payment paypal = pf.createPayment(MediosPago.PAYPAL);
		paypal.pay(334.2);
	}

}
