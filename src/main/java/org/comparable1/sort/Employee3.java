package org.comparable1.sort;

import java.util.Comparator;

public class Employee3 implements Comparable<Employee3>{

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

	public Employee3(int id, String name, int age, int salary) {
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
	public int compareTo(Employee3 o) {
		return (this.id - o.id);
	}
	/**
     * Comparator to sort employees list or array in order of Salary
     */
    public static Comparator<Employee3> SalaryComparator = new Comparator<Employee3>() {
 
        @Override
        public int compare(Employee3 e1, Employee3 e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };
 
    /**
     * Comparator to sort employees list or array in order of Age
     */
    public static Comparator<Employee3> AgeComparator = new Comparator<Employee3>() {
 
        @Override
        public int compare(Employee3 e1, Employee3 e2) {
            return e1.getAge() - e2.getAge();
        }
    };
 
    /**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<Employee3> NameComparator = new Comparator<Employee3>() {
 
        @Override
        public int compare(Employee3 e1, Employee3 e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
}
