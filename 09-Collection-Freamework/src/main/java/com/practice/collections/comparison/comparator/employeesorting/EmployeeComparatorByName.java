package com.practice.collections.comparison.comparator.employeesorting;

import java.util.Comparator;

class EmployeeComparatorByName implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		 int result = o1.name.compareTo(o2.name);
		
		return result;
	}
}
