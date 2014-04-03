package edu.concurrency;

import java.util.Map;

public class SimpleThreads {

	// Display a message, preceded by
	// the name of the current thread
	static void threadMessage(String message) {
		String threadName =
				Thread.currentThread().getName();
		System.out.format("%s: %s%n",
				threadName,
				message);
	}

	private final static int MILLIS_RUNABLE = 40;
	private final static int MILLIS_LOOP = 10;
	private static long MILLIS_WORKTIME = 1000 * 6;//0 * 60;

	private static class MessageLoop
	implements Runnable {
		public void run() {
			long startTime = System.currentTimeMillis();
			threadMessage("startTime = "+startTime);
			String importantInfo[] = {
					"Mares eat oats",
					"Does eat oats",
					"Little lambs eat ivy",
					"A kid will eat ivy too"
			};
			try {
				for (int i = 0;
						i < importantInfo.length;
						i++) {
					// Pause for 4 seconds
					Thread.sleep(MILLIS_RUNABLE);
					// Print a message
					long runTime = System.currentTimeMillis() - startTime;
					threadMessage(i+" "+importantInfo[i]+"..."+runTime);
					threadState();
				}
			} catch (InterruptedException e) {
				threadMessage("I wasn't done!");
			}
		}
	}

	public static void main(String args[])
			throws InterruptedException {

		// Delay, in milliseconds before
		// we interrupt MessageLoop
		// thread (default one hour).
		// If command line argument
		// present, gives patience
		// in seconds.
		if (args.length > 0) {
			try {
				MILLIS_WORKTIME = Long.parseLong(args[0]) * 1000;
			} catch (NumberFormatException e) {
				System.err.println("Argument must be an integer.");
				System.exit(1);
			}
		}

		threadMessage("Starting MessageLoop thread");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();

		threadMessage("Waiting for MessageLoop thread to finish");
		// loop until MessageLoop
		// thread exits

		debug(t);

		while (t.isAlive()) {
			long runTime = System.currentTimeMillis() - startTime;
			threadMessage("Still waiting..."+runTime);
			// Wait maximum of 1 second
			// for MessageLoop thread
			// to finish.
			t.join(MILLIS_LOOP);
			if ((runTime > MILLIS_WORKTIME)
					&& t.isAlive()) {
				threadMessage("Tired of waiting!..."+runTime+"/"+MILLIS_WORKTIME);
				t.interrupt();
				// Shouldn't be long now
				// -- wait indefinitely
				t.join();
			}
		}
		threadMessage("Finally!..."+(System.currentTimeMillis() - startTime));
	}

	private static void debug(Thread t) {
		System.out.println(Thread.getAllStackTraces());
		Thread.dumpStack();
		ClassLoader c = t.getContextClassLoader();
		Thread.UncaughtExceptionHandler handler = Thread
				.getDefaultUncaughtExceptionHandler();
		System.out.println("handler");
		System.out.println(handler);

		// sets the context ClassLoader for this Thread
		//					t.setContextClassLoader(c);
		System.out.println("Class = " + c.getClass());
		System.out.println("Parent = " + c.getParent());
		threadState();
	}

	private static void threadState() {
		Thread.State state = Thread.currentThread().getState();
		System.out.println(Thread.currentThread().getName());
		System.out.println("state = " + state);
	}
}
