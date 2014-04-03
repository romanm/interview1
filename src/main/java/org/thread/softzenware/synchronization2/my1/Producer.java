package org.thread.softzenware.synchronization2.my1;

class Producer implements Runnable {
	Q q;
	Producer(Q q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}
	public void run() {
		int i = 0;
		while (q.getN()<PC.CYCLE) {
			q.put(i++);
		}
	} 
}
