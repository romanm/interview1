package org.java.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
public static void main(String[] args) {
	Generation3List g = new Generation3List();
	System.out.println(g.getAuthor());
	Class<? extends Generation3List> class1 = g.getClass();
	Annotation[] declaredAnnotations = class1.getDeclaredAnnotations();
	System.out.println(declaredAnnotations.length);
	for(Method m:class1.getDeclaredMethods()){
		System.out.println(m);
	}
}
}
