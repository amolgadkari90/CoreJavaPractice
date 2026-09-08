package com.practice.collections.list.arraylist.employee2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class RemoveById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emps1 = new ArrayList<Employee>();
		emps1.add(new Employee(101, "Ravi"));
		emps1.add(new Employee(102, "Amit"));
		emps1.add(new Employee(103, "Neha"));
		
		emps1.removeIf(e -> e.id == 101);	
		
		System.out.println("************");		
		
		List<Employee> collect = emps1.stream().filter(e -> e.id != 101)
						.collect(Collectors.toList());
		
		Iterator<Employee> iterator = collect.iterator(); 
		
		while(iterator.hasNext()) {
			
			Employee next = iterator.next();
			
			System.out.println(next.id + "  " + next.name);
			
			
		}
	}
}
