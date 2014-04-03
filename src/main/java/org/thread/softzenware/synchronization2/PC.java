package org.thread.softzenware.synchronization2;

class PC {
	final static int CYCLE=10;
	public static void main(String args[]) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("\n\tq.getN()="+q.getN());
	} 
}
