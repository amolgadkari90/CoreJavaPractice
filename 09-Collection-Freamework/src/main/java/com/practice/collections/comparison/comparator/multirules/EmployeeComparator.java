package com.practice.collections.comparison.comparator.multirules;

import java.util.Comparator;

class EmployeeComparator implements Comparator<Employee> {
//	Department alphabetically ascending
//	Salary descending
//	Name alphabetically ascending
	
	@Override
	public int compare (Employee e1, Employee e2) {
		int result = e1.department.compareTo(e2.department);
		
		if(result == 0) {
			result = e2.salary.compareTo(e1.salary);
		}		
		if(result == 0) {
			result = e1.name.compareTo(e2.name);
		}				
		return result;
	}
	

}
