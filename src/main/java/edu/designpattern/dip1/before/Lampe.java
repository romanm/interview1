package edu.designpattern.dip1.before;

public class Lampe {
	private boolean leuchtet = false;

	public void anschalten() {
		leuchtet = true;
	}

	public void ausschalten() {
		leuchtet = false;
	}
}