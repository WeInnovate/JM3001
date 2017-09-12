package com.jm3001.learn.dp.factory;

public class PaymentFactory {
	public static Payment getPayment(String paymentMode) {
		
		Payment payment = null;
		
		if(paymentMode.equalsIgnoreCase("credit")){
			payment = new CreditCard();
		}
		else if(paymentMode.equalsIgnoreCase("debit")){
			payment = new DebitCard();
		}
		else if(paymentMode.equalsIgnoreCase("net")){
			payment = new NetBanking();
		}
		else{
			payment = new COD();
		}
		return payment;
	}
}
