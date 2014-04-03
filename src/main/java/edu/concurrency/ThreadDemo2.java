package edu.concurrency;

public class ThreadDemo2 {

	public static void main(String args[]){

		new ThreadClass("A");
		Thread t = Thread.currentThread();

		try {
			/* determines if the currently running thread has permission to 
         modify this thread */
			t.checkAccess();
			System.out.println("You have permission to modify");
		}

		/* if the current thread is not allowed to access this thread, then it 
      result in throwing a SecurityException. */
		catch(Exception e) {
			System.out.println(e);
		}
		Thread.dumpStack();
	}
}

class ThreadClass implements Runnable {

	Thread t;
	String str;

	ThreadClass(String str) {

		this.str = str;
		t = new Thread(this);
		// this will call run() function
		t.start();    
	}

	public void  run() {
		System.out.println("This is run() function");
	}
}