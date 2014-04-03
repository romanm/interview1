package edu.io.p3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import edu.io.Read1File;

public class TestFileInputStream extends Read1File{
	public static void main(String[] args) {
		try{
			InputStream inputstream = new FileInputStream(FILE_NAME);
			int data;
			while((data = inputstream.read()) != -1) 
				doSomethingWithData(data);
			inputstream.close();
		}catch (IOException e){
			System.err.println(e);
		}
	}
	private static void doSomethingWithData(int data) {
//		String str = new String((char)data, "UTF-8");
		System.out.print((char)data);
	}
}
