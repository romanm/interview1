package org.thread.forkjoin1;

public class Fib {
	final int n;
	public Fib(int n) {
		this.n=n;
	}
	protected Integer compute() {
		if (n <= 1)
			return n;
		Fib f1= new Fib(n-1),f2=new Fib(n-2);
		return f1.compute()+f2.compute();
	}
}
