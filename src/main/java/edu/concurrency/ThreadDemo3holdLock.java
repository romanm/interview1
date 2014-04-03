package edu.concurrency;

public class ThreadDemo3holdLock implements Runnable {

	Thread th;

	public ThreadDemo3holdLock() {

		th = new Thread(this);
		// this will call run() function
		th.start();
	}

	public void run() {

		/* returns true if and only if the current thread holds the
      monitor lock on the specified object */
		System.out.println("Holds Lock = " + Thread.holdsLock(this));  

		synchronized (this) {
			System.out.println("Holds Lock = " + Thread.holdsLock(this));
		}
	}

	public static void main(String[] args) {
		new ThreadDemo3holdLock();
	}
}