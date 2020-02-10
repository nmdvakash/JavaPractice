package com.arrays;

import java.util.ArrayList;

import com.Employee;

public class DuplicateElements {

	public static void main(String[] args) {

		/*
		 * ArrayList<String> list = new ArrayList<>();
		 * 
		 * list.add("1"); list.add("2"); list.add("3"); list.add("4"); list.add("5");
		 * list.add("6"); list.add("7");
		 * 
		 * ArrayList<String> list2 = new ArrayList<>(); list2.add("1"); list2.add("3");
		 * list2.add("5"); list2.add("6");
		 * 
		 * // Using iteration for (String str : list2) { if (list.contains(str)) {
		 * System.out.println("get value ::  " + str); } }
		 * 
		 * // using retainAll method System.out.println(list.retainAll(list2));
		 * System.out.println("list ::  " + list);
		 */

		ArrayList<Employee> emp1 = new ArrayList<>();
		ArrayList<Employee> emp2 = new ArrayList<>();
		emp1.add(new Employee(1L, "a", 2L));
		emp1.add(new Employee(2L, "a", 3L));
		emp1.add(new Employee(3L, "a", 4L));
		emp1.add(new Employee(4L, "a", 5L));
		emp1.add(new Employee(5L, "a", 6L));

		emp2.add(new Employee(1L, "a", 2L));
		emp2.add(new Employee(2L, "a", 3L));
		emp2.add(new Employee(3L, "a", 6L));
		emp2.add(new Employee(4L, "a", 5L));

		for (Employee emp : emp1) {
			if (emp2.contains(emp)) {
				System.out.println("get employee   ::  " + emp);
			}
		}

		emp1.retainAll(emp2);
		System.out.println("get Employee ::  " + emp1);
	}

}
