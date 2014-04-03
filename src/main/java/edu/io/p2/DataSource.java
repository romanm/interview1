package edu.io.p2;

import java.io.OutputStream;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

public class DataSource implements Runnable {
	private OutputStream outputStream = null;
	private String [] words = {"crack","hi","you","what","snort","me"}; 
	private XMLStreamWriter writer = null;

	public DataSource(OutputStream stream) {
		outputStream = stream;
	}

	@Override
	public void run() {
		System.out.println("DataSource.run");
		try {
			XMLOutputFactory output = XMLOutputFactory.newInstance();
			writer = output.createXMLStreamWriter(outputStream);
			writer.writeStartElement("root");
//			int max = 100000;
			int max = 10;
			for (int counter = 0; counter < max; counter++){
				int result = (int)(Math.random()*10) % 6;
				String word = words[result];
				writer.writeStartElement("word");
				writer.writeCharacters(word);
				writer.writeEndElement();
			}
			writer.writeEndElement();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				outputStream.flush();
				outputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
