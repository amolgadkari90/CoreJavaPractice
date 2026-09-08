package com.practice.collections.list.arraylist.employee3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class TotalSalary{
	int empCount;
	double totalSalary;
	public TotalSalary(int empCount, double totalSalary) {
		super();
		this.empCount = empCount;
		this.totalSalary = totalSalary;
	}	
}

class DeptAverageSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(101, "Amit", "IT", 80000.0));
		employees.add(new Employee(102, "Rahul", "HR", 70000.0));
		employees.add(new Employee(103, "Ajay", "IT", 95000.0));
		employees.add(new Employee(104, "Neha", "HR", 85000.0));
		employees.add(new Employee(105, "Rohit", "Finance", 90000.0));
		employees.add(new Employee(106, "Priya", "Finance", 85000.0));
		
		//Dept wise avg salary
		
		Map<String, TotalSalary> avgSalaryByDept = new HashMap<String, TotalSalary>();
		
		for(Employee e:employees) {
			
			String dept = e.department;
			TotalSalary totalSalary = avgSalaryByDept.get(dept);
			
			if(totalSalary == null) { 
				totalSalary = new TotalSalary(1, e.salary);				
			}else {
				totalSalary.empCount +=1;
				totalSalary.totalSalary = totalSalary.totalSalary + e.salary;
			}
			avgSalaryByDept.put(dept, totalSalary);
		}
		
		Set<Entry<String, TotalSalary>> entrySet = avgSalaryByDept.entrySet();
		
		Iterator<Entry<String, TotalSalary>> itr = entrySet.iterator();
		
		while (itr.hasNext()) {
			Entry<String, TotalSalary> next = itr.next();
			TotalSalary value = next.getValue();
			
			System.out.println(next.getKey() + " -> " + (value.totalSalary/value.empCount) );
		}

	}

}
