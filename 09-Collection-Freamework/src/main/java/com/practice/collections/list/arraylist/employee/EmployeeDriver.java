package com.practice.collections.list.arraylist.employee;

import java.util.ArrayList;
import java.util.List;

class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Ravi"));
		employees.add(new Employee("Amit"));
		employees.add(new Employee("Neha"));
		employees.add(new Employee("Ravi"));
		employees.add(new Employee("Kiran"));
		employees.add(new Employee("Amit"));
		employees.add(new Employee(null));
		employees.add(new Employee(null));
		employees.add(new Employee(""));
		employees.add(new Employee(""));
		
		List<Employee> uniqueEmployees = new ArrayList<Employee>();
		
		for(Employee e : employees) {
			if(!uniqueEmployees.contains(e)) {
				uniqueEmployees.add(e);
			}
		}
		
		for(Employee e: uniqueEmployees) {
			System.out.println("1 " +e.name);			
		}
	}
}
