package org.journaldev.thread1;

class ProcessingThread implements Runnable{
    private int count = 0;
     
    @Override
    public void run() {
        for(int i=1; i< 5; i++){
//        	synchronized (count) {
//        	}
        		count++;
        	System.out.println("processSomething "+i
        			+" in thread "+Thread.currentThread().getName()
        			+" times "+count);
            processSomething(i);
        }
    }
 
    public int getCount() {
        return this.count;
    }
 
    private void processSomething(int i) {
        // processing some job
        try {
        	int millis = i*1000;
        	System.out.println("sleap "+millis);
			Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     
}
