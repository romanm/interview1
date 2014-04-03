package edu.concurrency;

public class ObjectDemo2 {
	private final static int MILLIS_RUNABLE = 40;
	Integer i=0;
	void add(){
		i++;
	}
	public static void main(String[] args) {
		final ObjectDemo2 o = new ObjectDemo2();
		System.out.println("1 "+o.i);
		Runnable runA = new Runnable() {
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println(i+" 1runA "+o.i);
					o.add();
					try {
						Thread.sleep(MILLIS_RUNABLE);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i+" 2runA "+o.i);
				}
			}
		};
		Runnable runB = new Runnable() {
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println(i+" 1runB "+o.i);
					o.add();
					try {
						Thread.sleep(MILLIS_RUNABLE/2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i+" 2runB "+o.i);
				}
			}
		};
		System.out.println("2 "+o.i);
		Thread threadA = new Thread(runA, "A");
		threadA.start();
		Thread threadB = new Thread(runB, "A");
		threadB.start();
		System.out.println("3 "+o.i);
		threadA.interrupt();
		threadB.interrupt();
		System.out.println("4 "+o.i);
	}
}
