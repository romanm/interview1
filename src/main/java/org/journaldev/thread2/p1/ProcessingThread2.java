package org.journaldev.thread2.p1;

import java.util.concurrent.atomic.AtomicInteger;

class ProcessingThread2 implements Runnable {
    private AtomicInteger count = new AtomicInteger();
 
 
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
        	System.out.println("processSomething "+i
        			+" in thread "+Thread.currentThread().getName()
        			+" times "+count);
            processSomething(i);
            count.incrementAndGet();
        }
    }
 
 
    public int getCount() {
        return this.count.get();
    }
 
 
    private void processSomething(int i) {
        // processing some job
        try {
//            Thread.sleep(i * 1000);
            int millis = i*1000;
        	System.out.println("sleap "+millis);
			Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 
}

