package org.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Basic1 {
	public static void main(String[] args) {

		Integer integer = new Integer(11);
		integer.hashCode();
		String string = new String("abc");
		string.hashCode();
		System.out.println(string);
		byte[] dest = new byte[string.getBytes().length+1];
		System.arraycopy(string.getBytes(), 0, dest, 0, string.getBytes().length);
		String string2 = new String(dest);
		System.out.println(string2);
		System.out.println(string2.length());
		String string3 = Arrays.toString(dest);
		System.out.println("string3");
		System.out.println(string3);
		System.out.println(string3.length());
		System.out.println("string3");
		System.out.println(1);
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(integer, string);
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(integer, string);
		String s = "ab";
		String s1;
		System.out.println("---"+(s1=null));
	}
}
