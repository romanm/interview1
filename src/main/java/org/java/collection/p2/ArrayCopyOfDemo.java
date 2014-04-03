package org.java.collection.p2;
/**
 * @author roman
 * @see http://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 * @see http://docs.oracle.com/javase/tutorial/displayCode.html?code=http://docs.oracle.com/javase/tutorial/java/nutsandbolts/examples/ArrayCopyOfDemo.java
 */
class ArrayCopyOfDemo {
	public static void main(String[] args) {

		char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
				'i', 'n', 'a', 't', 'e', 'd'};

		char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

		System.out.println(new String(copyTo));
	}
}