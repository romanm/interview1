package edu.io.p3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import edu.io.Read1File;

public class TestFileReader extends Read1File{
	public static void main(String[] args) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(FILE_NAME);
			int data;
			while((data = fileReader.read())!= -1) {
				doSomethingWithData(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=fileReader)
				try {
					fileReader.close();
				} catch (IOException e) {}
		}
	}

	private static void doSomethingWithData(int data) {
		System.out.print((char)data);
	}
}
