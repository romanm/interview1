package edu.oop;

public class Polimorphism {
	abstract class Animal {
		abstract String talk();
	}

	class Cat extends Animal {
		String talk() { return "Meow!"; }
	}

	class Dog extends Animal {
		String talk() { return "Woof!"; }
	}

	void lets_hear(Animal a) {
		System.out.println(a.talk());
	}
	private void go() {
		Cat cat = new Cat();
		Dog dog = new Dog();
		lets_hear(dog);
		lets_hear(cat);
	}
	public static void main(String[] args) {
		Polimorphism p = new Polimorphism();
		p.go();
	}
}
