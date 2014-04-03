package org.java;

public class ObjWithStaticClass<E> {
	private class NodeNS<E> {
		NodeNS(){
			first=null;
		}
	}
	private static class Node<E> {
		E item;
		Node<E> next;
		Node<E> prev;
		Node(Node<E> prev, E element, Node<E> next) {
			this.item = element;
			this.next = next;
			this.prev = prev;
		}
	}
	Node<E> first;

	public E getFirstValue() {
		return first.item;
	}
	Node<E> getFirst() {
		return first;
	}
	int getFirstHashCode() {
		return first.hashCode();
	}
	public void add(E i) {
		final Node<E> node = new Node<E>(null, i, null);
		if(null==first) {
			first=node;
		}
	}
}
