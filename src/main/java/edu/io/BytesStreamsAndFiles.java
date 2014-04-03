package edu.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class BytesStreamsAndFiles extends Read1File{
	public static void main(String[] args) {
		BytesStreamsAndFiles test = new BytesStreamsAndFiles();
		//read in the bytes
		byte[] fileContents = test.read(FILE_NAME);
		log(fileContents);
		String str = byte2str(fileContents);
		log(str);
	}
	private static String byte2str(byte[] fileContents) {
		String str="";
		try {
			str = new String(fileContents, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}
	byte[] read(String aInputFileName){
		log("Reading in binary file named : " + aInputFileName);
		File file = new File(aInputFileName);	
		byte[] result = new byte[(int)file.length()];
		try {
			InputStream input = null;
			try {
				int totalBytesRead = 0;
				input = new BufferedInputStream(new FileInputStream(file));
				while(totalBytesRead < result.length){
					int bytesRemaining = result.length - totalBytesRead;
					//input.read() returns -1, 0, or more :
					int bytesRead = input.read(result, totalBytesRead, bytesRemaining); 
					if (bytesRead > 0){
						totalBytesRead = totalBytesRead + bytesRead;
					}
				}
				/*
		         the above style is a bit tricky: it places bytes into the 'result' array; 
		         'result' is an output parameter;
		         the while loop usually has a single iteration only.
				 */
				log("Num bytes read: " + totalBytesRead);
			}finally {
				log("Closing input stream.");
				input.close();
			}
		}catch (FileNotFoundException ex) {
			log("File not found.");
		}catch (IOException ex) {
			log(ex);
		}
		return result;
	}
}
