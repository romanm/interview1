package edu.io.p2;

import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

public class WordWatcher implements Runnable {
	private InputStream inputStream;
	private OutputStream outputStream;

	public WordWatcher(InputStream inputStream, OutputStream outputStream) {
		this.inputStream = inputStream;
		this.outputStream = outputStream;
	}

	@Override
	public void run() {
		System.out.println("WordWatcher.run");
		try {
			XMLInputFactory factory = XMLInputFactory.newInstance();
			XMLStreamReader reader = factory.createXMLStreamReader(inputStream);
			while (reader.hasNext()) {
				int next = reader.next();
				switch (next) {
				case XMLStreamConstants.CHARACTERS: {
					String text = reader.getText();
					if(text.equals("crack")) {
						text = "*****";
					}
					outputStream.write(text.getBytes());
					break;
				}
				}
			}
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
