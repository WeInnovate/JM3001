package com.jm3001.learn.dp.factory;

public class COD implements Payment {

	public boolean makePayment(double amount) {
		System.out.println("Payment for " + amount + " rupees will be done thru " + this.getClass().getSimpleName());
		return true;
	}

}
