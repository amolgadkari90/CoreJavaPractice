package com.practice.collections.comparison.comparator.multirules;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("Ravi", "IT", new BigDecimal("70000")));
		employees.add(new Employee("Amit", "HR", new BigDecimal("60000")));
		employees.add(new Employee("Neha", "IT", new BigDecimal("80000")));
		employees.add(new Employee("Kiran", "HR", new BigDecimal("60000")));
		employees.add(new Employee("Suresh", "IT", new BigDecimal("70000")));
		
		Collections.sort(employees, new EmployeeComparator());
		
		for(Employee e : employees) {
			System.out.println(e.name + "   "+ e.department + "   " + e.salary);
		}

	}

}
