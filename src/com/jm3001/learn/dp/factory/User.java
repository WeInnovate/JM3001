package com.jm3001.learn.dp.factory;

public class User {
	public static void main(String[] args) {

		String paymentMode = "";
		for (int i = 0; i < 10; i++) {
			int randomNumber = (int) (Math.random() * 10);
			System.out.println("Random Number: " + randomNumber);

			if (randomNumber >= 0 && randomNumber < 4) {
				paymentMode = "credit";
			} else if (randomNumber >= 4 && randomNumber < 7) {
				paymentMode = "debit";
			} else if (randomNumber >= 7 && randomNumber <= 8) {
				paymentMode = "net";
			} else {
				paymentMode = "cod";
			}
			
			Payment pay = PaymentFactory.getPayment(paymentMode);
			pay.makePayment(100.50d);
		}
		
	}
}
