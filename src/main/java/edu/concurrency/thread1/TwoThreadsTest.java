package edu.concurrency.thread1;

class TwoThreadsTest {
	public static void main (String[] args) {
		new SimpleThread("Jamaica").start();
		new SimpleThread("Fiji").start();
	}
}