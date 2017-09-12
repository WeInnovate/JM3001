package com.jm3001.learn.dp.factory;

public class DebitCard implements Payment {

	public boolean makePayment(double amount) {
		System.out.println("Payment for " + amount + " rupees is done thru " + this.getClass().getSimpleName());
		return true;
	}
}
