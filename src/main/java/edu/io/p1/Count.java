package edu.io.p1;

class Count {
	public static void main(String[] args)
			throws java.io.IOException
			{
		int count = 0;
System.out.println("-----------");
		while (System.in.read() != -1)
			count++;
		System.out.println("Input has " + count + " chars.");
			}
}