package org.thread.softzenware.synchronization2.notifywait;

class Q {
	int n;
	private boolean valueSet=false;
	public int getN() {
		return n;
	}
	synchronized 
	int get() {
		try {
			if(!valueSet)
				wait();
		} catch (InterruptedException e) {
			System.out.println("get wait");
		}
//		if (!valueSet)
//			try {
//			}catch(InterruptedException e){
//			}
		log("Got: " + n);
		valueSet=false;
		notify();
		return n;
	}
	synchronized 
	void put(int n) {
		try {
			if(valueSet)
				wait();
		} catch (InterruptedException e) {
			System.out.println("put wait");
		}
		this.n = n;
		valueSet=true;
		notify();
		log("Put: " + n);
	}
	private void log(String x) {
		String name = Thread.currentThread().getName();
		System.out.println(x
				//				+"[" +name +"]"
				);
	}
	public void get(int i) {
		String name = Thread.currentThread().getName();
		System.out.println("Got: " + (n--)+"[" +
				name +
				"]"+i);
	}
}
