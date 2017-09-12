package com.jm3001.learn.dp.singleton;

public class Client {

	public static void main(String[] args) {

		//		MyClass obj = new MyClass();
		
		MyClass obj1 = MyClass.createInstance();
		MyClass obj2 = MyClass.createInstance();
//		MyClass.instance;
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		obj1.doSomething();
		obj2.doSomething();
	}

}
