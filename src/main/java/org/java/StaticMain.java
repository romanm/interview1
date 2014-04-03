package org.java;

public class StaticMain {
	public static void main(String[] args) {
		ObjectWithStatic ows1 = new ObjectWithStatic();
		ObjectWithStatic ows2 = new ObjectWithStatic();
		ows1.setSti(1);
		ows2.setSti(2);
		ows1.setLoi(3);
		ows2.setLoi(4);
		System.out.println("sti="+ows1.getSti()+"/"+ows2.getSti()+" lti="+ows1.getLoi()+"/"+ows2.getLoi());
		ObjWithStaticClass owsc1 = new ObjWithStaticClass();
		ObjWithStaticClass owsc2 = new ObjWithStaticClass();
		owsc1.add(1);
		owsc2.add(2);
		System.out.println("val="+owsc1.getFirstValue()+"/"+owsc2.getFirstValue());
		System.out.println("obj="+owsc1.getFirst()+"/"+owsc2.getFirst());
		System.out.println("obj.hashCode="+owsc1.getFirstHashCode()+"/"+owsc2.getFirstHashCode());
	}
}
