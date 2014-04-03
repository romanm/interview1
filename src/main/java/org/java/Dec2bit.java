package org.java;

public class Dec2bit {
	String s;
	public void dec2bit() {
		//	System.out.println(Mathe.decimal2bit(11));
		int i = 4;
		s = "";
		while (i>1) {
			s=i%2+s;
			i/=2;
		}
		s=i+s;
		print();
	}
	private void print() {
		System.out.println(s);
		System.out.println("-------------");
		System.out.println(0.75f);
	}
}
