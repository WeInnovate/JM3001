package com.jm3001.learn.spring.carapp.v2;

public class MyCar {

	public static void main(String[] args) {
		Car car = null;

		// car = new HondaCity();
		car = new HondaAmaze();

		car.driveTheCar();
	}
}
