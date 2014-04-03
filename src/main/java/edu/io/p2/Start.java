package edu.io.p2;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author roman
 * @see http://www.certpal.com/blogs/2010/11/using-a-pipedinputstream-and-pipedoutputstream/
 */
public class Start {
	int BUFFER = 2048;

	public static void main(String... args) {
		new Start().go();
//		new Start().go2();
	}

	public void go() {
		try {
			long past = System.currentTimeMillis();

			PipedInputStream convertPipe = new PipedInputStream(BUFFER);
			PipedOutputStream dataPipe = new PipedOutputStream(convertPipe);

			PipedInputStream convertedWordPipe = new PipedInputStream(BUFFER);
			PipedOutputStream outputPipe = new PipedOutputStream(convertedWordPipe);

			DataSource dataSource = new DataSource(dataPipe);
			WordWatcher pipe = new WordWatcher(convertPipe,outputPipe);
			DataConsumer dataConsumer = new DataConsumer(convertedWordPipe);

			Thread producerThread = new Thread(dataSource);
			Thread pipeThread = new Thread(pipe);
			Thread consumerThread = new Thread(dataConsumer);

			producerThread.start();
			pipeThread.start();
			consumerThread.start();

			consumerThread.join();

			long now = System.currentTimeMillis();
			System.out.println("Time taken: " + (now-past) + " ms");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void go2() {
		try{
			PipedInputStream convertPipe = new PipedInputStream(BUFFER);
			PipedOutputStream dataPipe = new PipedOutputStream(convertPipe);
			
			DataSource dataSource = new DataSource(dataPipe);
			DataConsumer dataConsumer = new DataConsumer(convertPipe);

			Thread producerThread = new Thread(dataSource);
			Thread consumerThread = new Thread(dataConsumer);

			producerThread.start();
			consumerThread.start();

			consumerThread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
