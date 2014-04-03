package edu.designpattern.dip1;

public class LampeDIP implements SchalterKlient{
	private boolean leuchtet = false;

	public void geheAn() {
		leuchtet = true;
	}

	public void geheAus() {
		leuchtet = false;
	}
}