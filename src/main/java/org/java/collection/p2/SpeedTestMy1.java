package org.java.collection.p2;


import java.lang.instrument.Instrumentation;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author roman
 * @see http://javatechniques.com/blog/faster-deep-copies-of-java-objects/
 */
public class SpeedTestMy1 {

	public static void main(String[] args) {
		// Make a reasonable large test object. Note that this doesn't
		// do anything useful -- it is simply intended to be large, have
		// several levels of references, and be somewhat random. We start
		// with a hashtable and add vectors to it, where each element in
		// the vector is a Date object (initialized to the current time),
		// a semi-random string, and a (circular) reference back to the
		// object itself. In this case the resulting object produces
		// a serialized representation that is approximate 700K.
		Hashtable<Integer, Vector<Object[]>> obj = new Hashtable();
		int l = 0;
		for (int i = 0; i < 100; i++) {
			Vector v = new Vector();
			for (int j = 0; j < 100; j++) {
				v.addElement(new Object[] { 
						new Date(), 
						"A random number: " + Math.random(),
						obj
				});
				l++;
			}
			obj.put(new Integer(i), v);
		}
		System.out.println("l= "+l+" obj ");
		int iterations = 10;

		long cloneTime = 0L;
		l = 0;
		for (int i = 0; i < iterations; i++) {
			long start = System.currentTimeMillis();

			Hashtable<Integer, Vector<Object[]>> copy = new Hashtable<>(obj.size());
			Iterator<Integer> iterator = obj.keySet().iterator();
			while(iterator.hasNext()){
				Integer next = iterator.next();
				Vector<Object[]> cloneVs = new Vector<>();
				for (Object[] objArr : obj.get(next)) {
					Date dob = ((Date) objArr[0]);
					Object copyDate = dob.clone();
					String sob = new String((String) objArr[1]);
					cloneVs.addElement(new Object[]{copyDate,sob,copy});
					l++;
				}
				copy.put(next, cloneVs);
			}
			
			cloneTime += (System.currentTimeMillis() - start);
			copy = null;
			System.gc();
		}
		System.out.println("l= "+l);
		// Make copies of the object using the unoptimized version
		// of the deep copy utility.
		long unoptimizedTime = 0L;
		for (int i = 0; i < iterations; i++) {
			
			long start = System.currentTimeMillis();
			Object copy = UnoptimizedDeepCopy.copy(obj);
			unoptimizedTime += (System.currentTimeMillis() - start);

			// Avoid having GC run while we are timing...
			copy = null;
			System.gc();
		}


		// Repeat with the optimized version
		long optimizedTime = 0L;
		for (int i = 0; i < iterations; i++) {
			long start = System.currentTimeMillis();
			Object copy = DeepCopy.copy(obj);
			optimizedTime += (System.currentTimeMillis() - start);

			// Avoid having GC run while we are timing...
			copy = null;
			System.gc();
		}

		System.out.println("      Clone time: " + cloneTime+" "+l);
		System.out.println("Unoptimized time: " + unoptimizedTime);
		System.out.println("  Optimized time: " + optimizedTime);
	}

}