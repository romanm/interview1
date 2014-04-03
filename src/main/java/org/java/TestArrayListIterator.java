package org.java;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestArrayListIterator<E> {
	private int modCount;
	int size;
	private transient Object[] elementData;
	public E remove(int index) {
		return null;
	}
	/**
	 * An optimized version of AbstractList.Itr
	 */
	private class Itr implements Iterator<E> {
		int cursor;       // index of next element to return
		int lastRet = -1; // index of last element returned; -1 if no such
		int expectedModCount = modCount;

		public boolean hasNext() {
			return cursor != size;
		}

		@SuppressWarnings("unchecked")
		public E next() {
			checkForComodification();
			int i = cursor;
			if (i >= size)
				throw new NoSuchElementException();
			Object[] elementData = TestArrayListIterator.this.elementData;
			if (i >= elementData.length)
				throw new ConcurrentModificationException();
			cursor = i + 1;
			return (E) elementData[lastRet = i];
		}

		public void remove() {
			if (lastRet < 0)
				throw new IllegalStateException();
			checkForComodification();

			try {
				TestArrayListIterator.this.remove(lastRet);
				cursor = lastRet;
				lastRet = -1;
				expectedModCount = modCount;
			} catch (IndexOutOfBoundsException ex) {
				throw new ConcurrentModificationException();
			}
		}

		final void checkForComodification() {
			if (modCount != expectedModCount)
				throw new ConcurrentModificationException();
		}
	}
}
