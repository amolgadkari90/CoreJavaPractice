package com.practice.collections.comparison.comparator.employeesorting;

import java.util.Comparator;

public class EmployeeComparatorById implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		//Long.compare(e1.id, e2.id);  // Ascending
		//Long.compare(e2.id, e1.id);  // Descending
		int result = Long.compare(e2.id, e1.id);		
		return result;
	}
}
