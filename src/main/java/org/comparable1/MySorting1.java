package org.comparable1;

import java.util.Arrays;

import org.comparable1.sort.Employee1;

public class MySorting1 {
public static void main(String[] args) {
	//sorting custom object array
	Employee1[] empArr = new Employee1[4];
	empArr[0] = new Employee1(10, "Mikey", 25, 10000);
	empArr[1] = new Employee1(20, "Arun", 29, 20000);
	empArr[2] = new Employee1(5, "Lisa", 35, 5000);
	empArr[3] = new Employee1(1, "Pankaj", 32, 50000);
	//sorting employees array using Comparable interface implementation
	Arrays.sort(empArr);
	System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
}
}
