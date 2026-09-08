package com.practice.collections.comparison.comparator.employeesorting1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Ravi", new BigDecimal("50000")));
		employees.add(new Employee("Amit", new BigDecimal("70000")));
		employees.add(new Employee("Neha", BigDecimal.valueOf(50000)));
		employees.add(new Employee("Kiran", BigDecimal.valueOf(70000)));
		
		Collections.sort(employees, new ComparatorEmployeeBySalary());
		
		for(Employee e : employees) {
			System.out.println(e.name + "    " + e.salary);
		}

	}

}
