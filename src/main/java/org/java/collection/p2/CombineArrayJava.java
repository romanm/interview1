package org.java.collection.p2;

//import com.google.common.collect.ObjectArrays;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
//import org.apache.commons.lang.ArrayUtils;

/**
 * Java program to combine two arrays in Java. In this Java example
 * first we have concatenated two int arrays and later two String arrays.
 * First array combine examples uses Apache commons ArrayUtils, second array
 * join example uses Guava's ObjectArrays and last array concatenate example uses JDK.
 *
 * @author Javin Paul
 * @author roman
 *  @ see http://javarevisited.blogspot.com/2013/02/combine-integer-and-string-array-java-example-tutorial.html#ixzz2xAvJUDgS
 */
public class CombineArrayJava {

	public static void main(String args[]) {

		int [] first = {1,2,3, 4};
		int [] second = {5,6,7,8};

		// combine two arrays in Java using Apache commons ArrayUtils
		int [] combined = ArrayUtils.addAll(first, second);

		System.out.println("First array : " + Arrays.toString(first));
		System.out.println("Second array : " + Arrays.toString(second));
		System.out.println("Combined array : " + Arrays.toString(combined));


		String [] one = {"a", "b", "c"};
		String [] two = {"d", "e"};

		//joining array in Java using Guava library
		String [] joined = ObjectArrays.concat(one, two, String.class);
		System.out.println("Joined array : " + Arrays.toString(joined));

		//JDK way to combine two array in Java
		int[] array1 = {101,102,103,104};
		int[] array2 = {105,106,107,108};
		int[] concatenate = combine(array1, array2);
		System.out.println("concatenated array : " + Arrays.toString(concatenate));

	}

	private static int[] combine(int[] array1, int[] array2) {
		return null;
	}
}
