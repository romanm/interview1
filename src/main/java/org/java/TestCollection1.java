package org.java;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import org.java.tmp.HashMap;

public class TestCollection1 {
	public static void main(String[] args) {
		String s = "ab";
		String s2 = "ab";
		System.out.println(s.hashCode()+"/"+s2.hashCode());
		System.out.println(1 << 1);
		System.out.println(1 << 4);
		System.out.println(1 << 30);
		int i = 3;
		System.out.println(Integer.highestOneBit(i));
		System.out.println(Integer.bitCount(i));
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(11);
		arrayList.get(0);
		LinkedList<Object> linkedList = new LinkedList<>();
		linkedList.add(11);
		linkedList.add(12);
		linkedList.get(1);
		linkedList.add(12);
		HashSet<Object> hashSet = new HashSet<>(linkedList);
		hashSet.add(12);
		System.out.println(hashSet.toString());
		
		Map syncMap = Collections.synchronizedMap(new HashMap()) ;
		ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
		HashMap<Object, Object> hashMap = new HashMap<>();
		hashMap.put(1, 1);
		hashMap.get(1);
		TreeMap<Object, Object> treeMap = new TreeMap<>();
		treeMap.put(1, 1);
		treeMap.get(1);
		Integer i11 = new Integer(11);
		i11.compareTo(12);
		"ab".compareTo("ad");
		
//		x1();
//		x2();
	}

	private static AbstractCollection<String> x2() {
		return new AbstractCollection<String>() {
			@Override
			public Iterator<String> iterator() {
				return null;
			}
			@Override
			public int size() {
				return 0;
			}
		};
	}

	private static void x1() {
		System.out.println(Integer.MAX_VALUE);
		int j = 1;
		int i = 2;
		System.out.println(i>>j);
		System.out.println(i>j);
	}
}
