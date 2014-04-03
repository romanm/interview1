package edu.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReadWriteTextFileJDK7 extends Read1File{
	public static void main(String[] args) throws IOException {
		ReadWriteTextFileJDK7 textFile = new ReadWriteTextFileJDK7();
//		readWriteSmall(textFile);
		textFile.readLargerTextFile(FILE_NAME);
	}
	private static void readWriteSmall(ReadWriteTextFileJDK7 text)
			throws IOException {
		List<String> lines = text.readSmallTextFile(FILE_NAME);
		log(lines);
		lines.add("This is a line added in code.");
		text.writeSmallTextFile(lines, FILE_NAME);
	}
	List<String> readSmallTextFile(String aFileName) throws IOException {
		Path path = Paths.get(aFileName);
		return Files.readAllLines(path, ENCODING);
	}

	void writeSmallTextFile(List<String> aLines, String aFileName) throws IOException {
		Path path = Paths.get(aFileName);
		Files.write(path, aLines, ENCODING);
	}

	//For larger files

	void readLargerTextFile(String aFileName) throws IOException {
		Path path = Paths.get(aFileName);
		try (Scanner scanner =  new Scanner(path, ENCODING.name())){
			while (scanner.hasNextLine()){
				//process each line in some way
				log(scanner.nextLine());
			}
		}
	}

	void readLargerTextFileAlternate(String aFileName) throws IOException {
		Path path = Paths.get(aFileName);
		try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)){
			String line = null;
			while ((line = reader.readLine()) != null) {
				//process each line in some way
				log(line);
			}
		}
	}

	void writeLargerTextFile(String aFileName, List<String> aLines) throws IOException {
		Path path = Paths.get(aFileName);
		try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)){
			for(String line : aLines){
				writer.write(line);
				writer.newLine();
			}
		}
	}

}
