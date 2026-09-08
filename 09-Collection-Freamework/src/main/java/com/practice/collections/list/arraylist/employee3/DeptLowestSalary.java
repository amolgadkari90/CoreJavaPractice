package com.practice.collections.list.arraylist.employee3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class DeptLowestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = new ArrayList<Employee>();
		
		
		employees.add(new Employee(101, "Amit", "IT", 80000.0));
		employees.add(new Employee(102, "Rahul", "HR", 70000.0));
		employees.add(new Employee(103, "Ajay", "IT", 95000.0));
		employees.add(new Employee(104, "Neha", "HR", 85000.0));
		employees.add(new Employee(105, "Rohit", "Finance", 90000.0));
		employees.add(new Employee(106, "Priya", "Finance", 85000.0));

	
		//Same way Lowest in department 
		
		Map<String, Employee> lowestSalaryInDept = new HashMap<String, Employee>();
		
		for(Employee e : employees) {
			
			String dept = e.department;
			
			Employee emp = lowestSalaryInDept.get(dept);
			
			if(emp == null || e.salary < emp.salary) {
				lowestSalaryInDept.put(dept, e);
			}			
		}
		
		Set<Entry<String, Employee>> entrySet = lowestSalaryInDept.entrySet();
		
		Iterator<Entry<String, Employee>> itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			Entry<String, Employee> next = itr.next();
			Employee value = next.getValue();
			
			System.out.println(value);
			
		}
		
		
		
		
	}

}
