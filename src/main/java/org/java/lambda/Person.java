package org.java.lambda;

import java.util.Date;
import java.util.List;

public class Person {

	public enum Sex {
		MALE, FEMALE
	}

	String name;
	//	LocalDate birthday;
	Date birthday;
	Sex gender;
	String emailAddress;

	public int getAge() {
		return 0;
	}

	public void printPerson() {
		// ...
	}
	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for (Person p : roster) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}
}