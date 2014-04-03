package org.java.collection.p1;

public class CollectionDecorator  implements TestCollection{
	protected TestCollection testCollectionDecorator;
	public CollectionDecorator() {
		
	}
	public CollectionDecorator(TestCollection testCollectionDecorator) {
		this.testCollectionDecorator=testCollectionDecorator;
	}

	@Override
	public void fillCollection(Object element) {
		testCollectionDecorator.fillCollection(element);
	}

	@Override
	public void fillSets(int count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		testCollectionDecorator.print();
	}

}
