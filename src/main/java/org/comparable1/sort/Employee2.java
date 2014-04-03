package org.comparable1.sort;

public class Employee2 implements Comparable<Employee2>{

	private int id;
	private String name;
	private int age;
	private long salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	public Employee2(int id, String name, int age, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	//this is overriden to print the user friendly information about the Employee
	public String toString() {
		return "{id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
				this.salary + "}\n";
	}

	@Override
	public int compareTo(Employee2 o) {
		return (this.id - o.id);
	}

}
