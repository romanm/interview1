package org.thread.softzenware.synchronization2.my1;

class Consumer implements Runnable {
	Q q;
	Consumer(Q q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	public void run() {
		for (int i = 0; i < PC.CYCLE; i++) {
			q.get(i);
		}
	}
}
