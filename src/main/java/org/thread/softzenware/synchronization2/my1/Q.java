package org.thread.softzenware.synchronization2.my1;

class Q {
	int n;
	public int getN() {
		return n;
	}
//	synchronized 
	int get() {
		log("Got: " + n);
		return n;
	}
//	synchronized 
	void put(int n) {
		this.n = n;
		log("Put: " + n);
	}
	private void log(String x) {
		String name = Thread.currentThread().getName();
		System.out.println(x+"[" +
				name +
				"]");
	}
	public void get(int i) {
			String name = Thread.currentThread().getName();
			System.out.println("Got: " + (n--)+"[" +
					name +
					"]"+i);
	}
}
