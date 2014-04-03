package org.thread.forkjoin1;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinTest {

    static ForkJoinPool forkJoinPool = new ForkJoinPool();
    public static final int LENGTH = 1000;
    public static void main(String[] args) {
    	long start = System.currentTimeMillis();
        int [] numbers = new int[LENGTH];
        //Create  an array with some values. 
        for(int i=0; i<LENGTH; i++){
            numbers[i] = i * 2;
        }
        /*
         * Invoke the NumberDividerTask with the array
         * which in turn creates multiple sub tasks.
         */
        int sum = forkJoinPool.invoke(new NumberDividerTask(numbers));
      long usedTime = System.currentTimeMillis()-start;
      System.out.println("Sum: "+sum+" usedTime="+usedTime);
    }
}
