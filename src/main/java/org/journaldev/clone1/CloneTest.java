package org.journaldev.clone1;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author roman
 * @see http://www.journaldev.com/60/understanding-java-object-cloning-and-when-to-override-it
 */
public class CloneTest implements Cloneable {
	private int id;
	private String name; 
	private HashMap props;
	
	public int getId() { return id; } 
	public void setId(int id) { this.id = id; } 
	public String getName() { return name; } 
	public void setName(String name) { this.name = name; } 
	public HashMap getProps() { return props; } 
	public void setProps(HashMap props) { this.props = props; }

	/**
	 */
	public CloneTest clone() {
		System.out.println("invoking overridden clone method");
		HashMap hm = new HashMap();
		String key;
		Iterator it = this.props.keySet().iterator();
		// Deep Copy of field by field
		while (it.hasNext()) {
			key = (String) it.next();
			hm.put(key, this.props.get(key));
		}
		CloneTest ct = new CloneTest();
		ct.setId(this.id);
		ct.setName(this.name);
		ct.setProps(hm);
		return ct;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {

		CloneTest ct1 = new CloneTest();
		ct1.setId(1);
		ct1.setName("first");
		HashMap hm = new HashMap();
		hm.put("1", "first");
		hm.put("2", "second");
		hm.put("3", "third");
		ct1.setProps(hm);
		// Using default clone() implementation
		CloneTest ct2 = (CloneTest) ct1.clone();
		// Check whether the ct1 and ct2 attributes are same or different
		System.out.println("ct1 and ct2 HashMap == test: "
				+ (ct1.getProps() == ct2.getProps()));
		// Lets see the effect of using default cloning
		ct1.getProps().put("4", "fourth");
		System.out.println("ct1 props:" + ct1.getProps());
		System.out.println("ct2 props:" + ct2.getProps());
		ct1.setName("new");
		System.out.println("ct1 name:" + ct1.getName());
		System.out.println("ct2 name:" + ct2.getName());
	}
}
