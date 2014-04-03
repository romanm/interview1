package edu.designpattern.singleton1;

public class SingletonLazy1 {
	
	private SingletonLazy1(){}  
	
	private static SingletonLazy1 instance;
	
	public static synchronized SingletonLazy1 getInstance() {
		if (instance==null) {
			instance = new SingletonLazy1();
		}
		return instance;
	}
}
