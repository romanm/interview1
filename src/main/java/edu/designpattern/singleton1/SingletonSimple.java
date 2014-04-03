package edu.designpattern.singleton1;

/**
 * @author roman
 * @see http://uk.wikipedia.org/wiki/%D0%9E%D0%B4%D0%B8%D0%BD%D0%B0%D0%BA_%28%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D1%83%D0%B2%D0%B0%D0%BD%D0%BD%D1%8F%29
 * 
 */
public class SingletonSimple {
	private SingletonSimple(){}  
	private static final SingletonSimple instance = new SingletonSimple();
	public static SingletonSimple getInstance() {
		return instance;
	}
}