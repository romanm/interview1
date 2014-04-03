package edu.designpattern.facade2;
/* Complex parts */
class Memory {
	public void load(long position, byte[] data) { 
		System.out.println("load");
	}
}