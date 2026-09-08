package com.practice.collections.list.arraylist.employee2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SecondHighestSalary {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(101, "Amit", 80000.0));
		emps.add(new Employee(102, "Rahul", 95000.0));
		emps.add(new Employee(103, "Ajay", 95000.0));
		emps.add(new Employee(104, "Neha", 70000.0));
		emps.add(new Employee(105, "Rohit", 85000.0));
		
		Comparator<Employee> comparator =
		        new Comparator<Employee>() {
		            @Override
		            public int compare(Employee e1, Employee e2) {
		                return Double.compare(e2.salary, e1.salary);
		            }
		        };
		
		Employee employee = emps.stream()
		        .sorted(comparator)
		        .skip(1)
		        .findFirst()
		        .get();
		
		System.out.println(employee.salary);


	}

}
