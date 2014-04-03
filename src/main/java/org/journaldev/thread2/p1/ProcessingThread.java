package org.journaldev.thread2.p1;

class ProcessingThread implements Runnable {
    private int count;
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
        	System.out.println("processSomething "+i
        			+" in thread "+Thread.currentThread().getName()
        			+" times "+count);
            processSomething(i);
            count++;
        }
    }
    public int getCount() { return this.count; } 
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
