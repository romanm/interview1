package edu.concurrency;

public class ThreadDemo1 {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		t.setName("Admin Thread");
		// set thread priority to 1
		t.setPriority(1);

		// prints the current thread
		System.out.println("Thread = " + t);

		int count = Thread.activeCount();
		System.out.println("currently active threads = " + count);

		Thread th[] = new Thread[count];
		// returns the number of threads put into the array 
		Thread.enumerate(th);

		// prints active threads
		for (int i = 0; i < count; i++) {
			System.out.println(i + ": " + th[i]);
		}
	}
} 