package org.thread.softzenware.synchronization2.notifywait;

/**
 * @author roman
 * @see http://www.softzenware.com/java/11.htm
 * @see http://stackoverflow.com/questions/2536692/a-simple-scenario-using-wait-and-notify-in-java
 */
class PC {
	final static int CYCLE=10;
	public static void main(String args[]) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("\tq.getN()="+q.getN());
	} 
}
