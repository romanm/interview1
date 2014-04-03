package edu.concurrency;

public class PrimeRun implements Runnable{
	long minPrime;
	PrimeRun(long minPrime) {
		this.minPrime = minPrime;
	}

	public void run() {
		System.out.println("run...");
	}
	public static void main(String[] args) {
		PrimeRun p = new PrimeRun(143);
		new Thread(p).start();
	}
}
