package org.java.collection.p2;
import java.util.*;

import org.apache.commons.lang3.time.StopWatch;

/**
 * 
 * @author roman
 * @see http://www.javapractices.com/topic/TopicAction.do?Id=3
 * mvn exec:java -Dexec.mainClass="org.java.collection.p2.ArrayCopier" -Dexec.args="performance 2222"
 * 
 * 
 * http://stackoverflow.com/questions/18638743/is-it-better-to-use-system-arraycopy-than-a-fast-for-loop-for-copying-array
 * I know JUnit tests aren't really the best for benchmarking, but
testHardCopyBytes took 0.157s to complete
and
testArrayCopyBytes took 0.086s to complete.
 * 
 */


public final class ArrayCopier {

	public static void main (String... aArguments) {
		String action = aArguments[0];
		int numIterations = 0;
		if (aArguments.length == 2) {
			numIterations = Integer.parseInt(aArguments[1]);
		}

		if ("performance".equals(action)) {
			demoPerformance(numIterations);
		}
		else if ("storage".equals(action)) {
			demoIndependanceOfStorage();
		}
	}

	/**
	 * Display the time it takes to copy an array in various ways.
	 */
	private static void demoPerformance(int aNumIterations){
		StopWatch stopwatch = new StopWatch();
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};

		stopwatch.start();
		copyUsingClone(numbers, aNumIterations);
		stopwatch.stop();
		log("Using clone: " + stopwatch);

		stopwatch.reset();
		stopwatch.start();
		copyUsingArraycopy(numbers, aNumIterations);
		stopwatch.stop();
		log("Using System.arraycopy: " + stopwatch);

		stopwatch.reset();
		stopwatch.start();
		copyUsingArraysCopyOf(numbers, aNumIterations);
		stopwatch.stop();
		log("Using Arrays.copyOf: " + stopwatch);

		stopwatch.reset();
		stopwatch.start();
		copyUsingForLoop(numbers, aNumIterations);
		stopwatch.stop();
		log("Using for loop: " + stopwatch);
	}

	private static void copyUsingClone(int[] aArray , int aNumIterations) {
		for(int idx = 0 ; idx < aNumIterations; ++idx) {

			int[] copy = (int[])aArray.clone();

		}
	}

	private static void copyUsingArraycopy(int[] aArray , int aNumIterations) {
		for(int idx = 0 ; idx < aNumIterations; ++idx) {

			int [] copy = new int[aArray.length];
			System.arraycopy( aArray, 0, copy, 0, aArray.length );

		}
	}

	private static void copyUsingArraysCopyOf( int[] aArray , int aNumIterations) {
		for(int idx = 0 ; idx < aNumIterations; ++idx) {

			int[] copy = Arrays.copyOf(aArray, aArray.length);

		}
	}


	private static void copyUsingForLoop( int[] aArray , int aNumIterations) {
		for(int iterIdx = 0 ; iterIdx < aNumIterations; ++iterIdx) {

			int [] copy = new int[aArray.length];
			for (int idx = 0; idx < aArray.length; ++idx) {
				copy[idx] = aArray[idx];
			}

		}
	}

	private static void log(String aMessage){
		System.out.println(aMessage);  
	}

	/**
	 * (The for-loop and System.arraycopy styles clearly have independent
	 * storage, and are not exercised in this method.)
	 */
	private static void demoIndependanceOfStorage() {
		//a clone of a one-dimensional array has independent storage
		int[] numbers = {1,1,1,1};
		int[] numbersClone = (int[])numbers.clone();
		//set 0th element to 0, and compare
		numbersClone[0] = 0;
		log("Altered clone has NOT affected original:");
		log("numbersClone[0]: " + numbersClone[0]);
		log("numbers[0]: " +  numbers[0]);

		//the clone of a multi-dimensional array does *not* have
		//independant storage
		int[][] matrix = { {1,1}, {1,1} };
		int[][] matrixClone = (int[][])matrix.clone();
		//set 0-0th element to 0, and compare
		matrixClone[0][0] = 0;
		log("Altered clone has affected original:");
		log("matrixClone element 0-0:" + matrixClone[0][0]);
		log("matrix element 0-0: " + matrix[0][0]);

		//the clone of an array of objects as well is only shallow
		Date[] dates = {new Date()};
		log("Original date: " + dates[0]);
		Date[] datesClone = (Date[])dates.clone();
		datesClone[0].setTime(0);
		log("Altered clone has affected original:");
		log("datesClone[0]:" + datesClone[0]);
		log("dates[0]: " + dates[0]);
	}
}
