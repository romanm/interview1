package edu.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashSet;

public class FileOutputStreamTest {
	final static String FILE_NAME = "/home/roman/tmp/ObjectOutput.txt";
	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream(FILE_NAME);
			ObjectOutput s = new ObjectOutputStream(f);
			s.writeObject("Today");
			s.writeObject(new Date());
			HashSet<Integer> hashSet = new HashSet<>();
			hashSet.add(11);
			s.writeObject(hashSet);
			s.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
