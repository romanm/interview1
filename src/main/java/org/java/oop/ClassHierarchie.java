package org.java.oop;

public class ClassHierarchie {
	class NestedClass{

	}
	static class StaticNestedClass{
		
	}
	class InnerClass{
		
	}
	void methodB(){
		class B{

		}
	}
	public static void main(String[] args) {
		ClassHierarchie classHierarchie = new ClassHierarchie();
		InnerClass innerClass = classHierarchie.new InnerClass();
		ClassHierarchie.InnerClass innerClass2 = classHierarchie.new InnerClass();
	}
}
