package org.java.collection.p1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetShow implements TestCollection{
	private HashSet<Integer> hashSet;
	private TreeSet<Integer> treeSet;
	private LinkedHashSet<Integer> linkedHashSet;

	public SetShow(){
		hashSet = new HashSet<Integer>();
		treeSet = new TreeSet<Integer>();
		linkedHashSet = new LinkedHashSet<Integer>();
		System.out.println("SetShow");
	}

	@Override
	public void fillCollection(Object element) {
		Integer element2 = (Integer) element;
		hashSet.add(element2);
		treeSet.add(element2);
		linkedHashSet.add(element2);
	}

	@Override
	public void fillSets(int count) {}

	@Override
	public void print() {
		System.out.println("LinkedHashSet: \t" + linkedHashSet.toString() + " (" + linkedHashSet.size() + ")");
		System.out.println("TreeSet: \t" + treeSet.toString() + " (" + treeSet.size() + ")");
		System.out.println("HashSet: \t" + hashSet.toString() + " (" + hashSet.size() + ")");
		System.out.println("");
		int i = (int) (100/.75f)+1;
		System.out.println("i="+i);
		int max = Math.max(i,16);
		System.out.println("max="+max);
	}

}
