package com.jm3001.learn.dp.singleton;

public class MyClass {

	public static MyClass instance;

	public void doSomething() {
		System.out.println(this.getClass().getSimpleName() + " is doing somthing.");
	}

	private MyClass() {
		System.out.println(this.getClass().getSimpleName() + " object is being created.");
	}

	public static  synchronized MyClass createInstance() {
		if (instance == null) {
			synchronized (instance) {
				instance = new MyClass();
			}
			
		}
		return instance;
	}
}
