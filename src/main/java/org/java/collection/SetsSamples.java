package org.java.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetsSamples {
	private HashSet<Integer> hashSet;
	private TreeSet<Integer> treeSet;
	private LinkedHashSet<Integer> linkedHashSet;
	private String array;
	public SetsSamples(){
		hashSet = new HashSet<Integer>();
		treeSet = new TreeSet<Integer>();
		linkedHashSet = new LinkedHashSet<Integer>();
	}
	public void print(){
		System.out.println("array: \t\t"+array);
		System.out.println("LinkedHashSet: \t" + linkedHashSet.toString() + " (" + linkedHashSet.size() + ")");
		System.out.println("TreeSet: \t" + treeSet.toString() + " (" + treeSet.size() + ")");
		System.out.println("HashSet: \t" + hashSet.toString() + " (" + hashSet.size() + ")");
		System.out.println("");
	}
	public void fillSets(int count) {
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < count; i++){
			Integer element = rand.nextInt(100);
			hashSet.add(element);
			treeSet.add(element);
			linkedHashSet.add(element);
			if(i!=count)
				sb.append(element).append(", ");
		}
		sb.append("]").delete(sb.length()-3, sb.length()-1);
		array = sb.toString();
	}
}
