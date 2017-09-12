package com.jm3001.learn.dp.singleton;

public class Client2 {

	public static void main(String[] args) {

		//		MyClass obj = new MyClass();
		
		MyClass obj = MyClass.createInstance();
		
		obj.doSomething();
	}

}
