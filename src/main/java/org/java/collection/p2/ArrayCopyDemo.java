package org.java.collection.p2;

/**
 * @author roman
 * @see http://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 * @see http://docs.oracle.com/javase/tutorial/displayCode.html?code=http://docs.oracle.com/javase/tutorial/java/nutsandbolts/examples/ArrayCopyDemo.java
 */
class ArrayCopyDemo {
	public static void main(String[] args) {
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
				'i', 'n', 'a', 't', 'e', 'd' };
		char[] copyTo = new char[7];

		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));
	}
}