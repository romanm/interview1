package edu.designpattern.observer1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.java.tmp.Observable;
//import java.util.Observable;

/**
 * @author roman
 *
 */
public class EventSource extends Observable implements Runnable {
	private Thread thread;
	public void setThread(Thread thread) { this.thread=thread; }
	void quit(){thread.interrupt();}
	
	public void run(){
		try {
			final InputStreamReader isr = new InputStreamReader(System.in);
			final BufferedReader br = new BufferedReader(isr);
//			while (true && !quit) {
			while (!thread.isInterrupted()) {
				String response = br.readLine();
				setChanged();
				notifyObservers(response);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
