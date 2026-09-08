package com.practice.collections.list.arraylist.employee3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class DeptHighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = new ArrayList<Employee>();
		
		
		employees.add(new Employee(101, "Amit", "IT", 80000.0));
		employees.add(new Employee(102, "Rahul", "HR", 70000.0));
		employees.add(new Employee(103, "Ajay", "IT", 95000.0));
		employees.add(new Employee(104, "Neha", "HR", 85000.0));
		employees.add(new Employee(105, "Rohit", "Finance", 90000.0));
		employees.add(new Employee(106, "Priya", "Finance", 85000.0));



		Map<String , Employee> highestByDept = new HashMap<String, Employee>();
		
		for(Employee e :employees) {
			String dept = e.department;
			
			Employee exiting = highestByDept.get(dept);
			
			if(exiting == null || e.salary > exiting.salary) {
				highestByDept.put(dept, e);
			}			
		}
		
		//Hash map do not extends Iterator to iterate hashMap we need to convert it to entrySet 
		
		Set<Entry<String, Employee>> entrySet = highestByDept.entrySet();
		
		Iterator<Entry<String, Employee>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			Entry<String, Employee> next = iterator.next();
			System.out.println(next.getKey() + " -> " + next.getValue());
		}			
	}
}
