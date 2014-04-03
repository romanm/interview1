package edu.designpattern.facade2;
/* Complex parts */
class HardDrive {
	public byte[] read(long lba, int size) { 
		System.out.println("read");
		return null;
	}
}