package com.practice.collections.comparison.comparator.employeesorting1;

import java.util.Comparator;

class ComparatorEmployeeBySalary implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		
		int result = e2.salary.compareTo(e1.salary);		
		if(result == 0) {
			result = e1.name.compareTo(e2.name);
		}		
		return result;
	}
	
	

}
