package edu.concurrency;


public class ObjectDemo3 {
	private final static int MILLIS_RUNABLE = 40;
	Integer i=0;
//	synchronized 
	void add(){
		i++;
	}
	static class R implements Runnable{
		private ObjectDemo3 o;

		public R(ObjectDemo3 o) {
			this.o=o;
		}

		public void run() {
			try{
				for (int i = 0; i < 3; i++) {
					threadMessage("i="+i+" o.i = "+o.i);
					o.add();
					Thread.sleep(10);
				}
			} catch (InterruptedException e) {
				threadMessage("I wasn't done!");
			}
		}
	}
	static void threadMessage(String message) {
		String threadName =
				Thread.currentThread().getName();
		System.out.format("%s: %s%n",
				threadName,
				message);
	}
	public static void main(String[] args) throws InterruptedException {
		threadMessage("Starting MessageLoop thread");
		ObjectDemo3 o = new ObjectDemo3();
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new R(o));
		t.start();
		int j = 0;

		int count = Thread.activeCount();
		System.out.println("currently active threads = " + count);

		Thread th[] = new Thread[count];
		// returns the number of threads put into the array 
		Thread.enumerate(th);

		// prints active threads
		for (int i = 0; i < count; i++) {
			System.out.println(i + ": " + th[i]);
		}
		while (t.isAlive()) {
			threadMessage("j="+j+" o.i = "+o.i);
			o.add();
			t.join(30);
			j++;
		}
		threadMessage("Finish MessageLoop thread");
	}
}
