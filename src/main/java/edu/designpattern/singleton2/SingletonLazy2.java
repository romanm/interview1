package edu.designpattern.singleton2;

/**
 * @author roman
 *
 */
public class SingletonLazy2 {
	private SingletonLazy2() {}

	private static class SingletonHolder {
		private static final SingletonLazy2 instance = new SingletonLazy2();
	} 

	public static SingletonLazy2 getInstance() {
		return SingletonHolder.instance;
	}
}