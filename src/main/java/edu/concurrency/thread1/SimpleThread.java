package edu.concurrency.thread1;

class SimpleThread extends Thread {
	public SimpleThread(String str) {
		super(str);
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			int millisSleep = (int)(Math.random() * 1000);
			System.out.println(i + " " + getName()+" millisSleep = "+millisSleep);
			try {
				sleep(millisSleep);
			} catch (InterruptedException e) {}
		}
		System.out.println("DONE! " + getName());
	}
}