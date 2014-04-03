package edu.io;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Read1File {
	protected final static String FILE_NAME = "/home/roman/tmp/testing.txt";
	final static Charset ENCODING = StandardCharsets.UTF_8;
	protected static void log(Object aMsg){
		System.out.println(String.valueOf(aMsg));
	}
}
