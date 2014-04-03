package edu.designpattern.observer1;

import org.java.tmp.Observable;
//import java.util.Observable;
//import java.util.Observer;  /* this is Event Handler */
import org.java.tmp.Observer;

public class ResponseHandler implements Observer {
	private String resp;
	private EventSource es;
	public void update(Observable obj, Object arg) {
		if(!(arg instanceof String))
			throw new RuntimeException();
		resp = (String) arg;
		if(!(obj instanceof EventSource))
			throw new RuntimeException();
		es = (EventSource)obj;
		
		System.out.println("\n Received Response: " + resp );
		if("quit".equals(resp.toLowerCase())){
			es.quit();
			System.out.println("bey!");
		}
	}
}
