package org.thread.softzenware.synchronization1;

/**
 * @author roman
 * @see http://www.softzenware.com/java/11.htm
 */
class SynchMain {
	public static void main(String args[]) {
		Callme target = new Callme();
		new Caller(target, "Hello.");
		new Caller(target, "Synchronized");
		new Caller(target, "World");
	}
}
