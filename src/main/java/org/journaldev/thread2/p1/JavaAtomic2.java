package org.journaldev.thread2.p1;



public class JavaAtomic2 {
	 
    public static void main(String[] args) throws InterruptedException {
    	long start = System.currentTimeMillis();
    	System.out.println("private AtomicInteger count = new AtomicInteger();");
        ProcessingThread2 pt = new ProcessingThread2();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Processing count=" + pt.getCount()+(System.currentTimeMillis()-start));
    }
}
