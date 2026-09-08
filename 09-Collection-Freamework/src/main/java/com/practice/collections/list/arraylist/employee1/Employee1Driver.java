package com.practice.collections.list.arraylist.employee1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee1Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emps1 = new ArrayList<Employee>();
		emps1.add(new Employee(101, "Ravi"));
		emps1.add(new Employee(102, "Amit"));
		emps1.add(new Employee(103, "Neha"));
		
		List<Employee> emps2 = new ArrayList<Employee>();
		emps2.add(new Employee(104, "Kiran"));
		emps2.add(new Employee(102, "Amit"));
		emps2.add(new Employee(103, "Neha"));
		
		
		Set<Employee> empSet = new HashSet<Employee>(emps1); // O(n)
		
		List<Employee> collect = emps2.stream().filter(empSet::contains).collect(Collectors.toList());
		
		collect.stream().forEach(c -> System.out.println(c.id + "  "+c.name));
		

	}

}
