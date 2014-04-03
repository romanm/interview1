package org.thread.softzenware.synchronization1;

class Caller implements Runnable {
	String msg;
	Callme target;
	public Caller(Callme t, String s) {
		target = t;
		msg = s;
		new Thread(this).start();
	}
	public void run() {
		target.call(msg);
	} 
}


