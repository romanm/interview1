package org.comparable1;

import java.util.Arrays;

import org.comparable1.sort.Employee3;

public class MySorting3 {
	public static void main(String[] args) {
		//sorting custom object array
		Employee3[] empArr = new Employee3[4];
		empArr[0] = new Employee3(10, "Mikey", 25, 10000);
		empArr[1] = new Employee3(20, "Arun", 29, 20000);
		empArr[2] = new Employee3(5, "Lisa", 35, 5000);
		empArr[3] = new Employee3(1, "Pankaj", 32, 50000);
		//sorting employees array using Comparable interface implementation
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
		//sort employees array using Comparator by Salary
		Arrays.sort(empArr, Employee3.SalaryComparator);
		System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));
		//sort employees array using Comparator by Age
		Arrays.sort(empArr, Employee3.AgeComparator);
		System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));
		//sort employees array using Comparator by Name
		Arrays.sort(empArr, Employee3.NameComparator);
		System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));
	}
}
