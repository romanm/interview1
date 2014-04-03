package org.thread.forkjoin1;

import java.util.concurrent.ForkJoinPool;


public class FibMain {
	static ForkJoinPool forkJoinPool = new ForkJoinPool();
	public static void main(String[] args) {
		int n = 45;
		System.out.println("--------");
		Fibonacci fibonacci = new Fibonacci(n);
		Fib fib = new Fib(n);
		long start,end;
		System.out.println("--------");
		c2(n, fib);
		c1(n, fibonacci);
		System.out.println("--------");
	}
	private static void c2(int n, Fib fib) {
		long start;
		long end;
		start = System.currentTimeMillis();
		Integer compute2 = fib.compute();
		end = System.currentTimeMillis()-start;
		System.out.println(n+" = "+compute2+"    "+end);
	}
	private static void c1(int n, Fibonacci fibonacci) {
		long start;
		long end;
		start = System.currentTimeMillis();
		Integer invoke = forkJoinPool.invoke(fibonacci);
		end = System.currentTimeMillis()-start;
		System.out.println(n+" = "+invoke+"    "+end);
	}
}
