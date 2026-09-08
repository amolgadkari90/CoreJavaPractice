package com.practice.collections.comparison.comparator.employeesorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(101, "Ravi"));
		employees.add(new Employee(102, "Amit"));
		employees.add(new Employee(103, "Neha"));
		employees.add(new Employee(104, "Kiran"));
		
		Collections.sort(employees, new EmployeeComparatorByName());
		for(Employee e: employees) {
			System.out.print(e.id + " -> " + e.name +"  ,");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		Collections.sort(employees, new EmployeeComparatorById());
		for(Employee e : employees) {
			System.out.print(e.id + " -> " + e.name +"  ,");
		}
	}
}
