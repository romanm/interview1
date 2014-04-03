package org.java.collection.p1;

import java.util.Random;

//public class CollectionShowDecorator implements TestCollection{
public class CollectionShowDecorator extends CollectionDecorator{
	private StringBuilder sb;
	private String array;
	private boolean b;
	public CollectionShowDecorator(){
		init();
	}
	public CollectionShowDecorator(TestCollection testCollectionDecorator){
		super(testCollectionDecorator);
		init();
	}
	private void init() {
		sb = new StringBuilder();
		sb.append("[");
	}
	@Override
	public void fillCollection(Object element) {
		sb.append(element);
		if(b)
			sb.append(", ");
		super.fillCollection(element);
	}

	@Override
	public void fillSets(int count) {
		Random rand = new Random();
		for(int i = 0; i < count; i++){
			Integer element = rand.nextInt(100);
			b = i!=count;
			fillCollection(element);
		}
		sb.append("]").delete(sb.length()-3, sb.length()-1);
		array = sb.toString();
	}

	@Override
	public void print() {
		System.out.println("array: \t\t"+array);
		super.print();
	}

}
