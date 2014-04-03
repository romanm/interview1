package org.java.collection.p1;

public class Main {
public static void main(String[] args) {
	CollectionShowDecorator collectionShowDecorator 
	= new CollectionShowDecorator(
			new SetShow());
	collectionShowDecorator.fillSets(10);
	collectionShowDecorator.print();
}
}
