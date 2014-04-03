package org.java.collection;

import java.util.ArrayList;
import java.util.HashSet;

import org.java.tmp.HashMap;

public class Main2 {
	public static void main(String[] args) {
		arryList();
		HashSet<Object> hashSet = new HashSet<>();
		hashSet.add(11);
		HashMap<Object, Object> hashMap = new HashMap<>();
		hashMap.put(11, "elf");
		hashMap.put(12, "twelf");
	}

	private static void arryList() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(11);
		arrayList.add(34);
		arrayList.add(14);
		arrayList.add(34);
		arrayList.add(23);
		System.out.println(arrayList.toString());
		arrayList.lastIndexOf(34);
		for(;;)
			if(!arrayList.remove(new Integer(34)))
				break;
		System.out.println(arrayList.toString());
	}
}
