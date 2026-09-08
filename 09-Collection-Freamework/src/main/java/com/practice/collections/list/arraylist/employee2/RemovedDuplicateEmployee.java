package com.practice.collections.list.arraylist.employee2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

class RemovedDuplicateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Amit"));
		empList.add(new Employee(102, "Rahul"));
		empList.add(new Employee(101, "Ajay"));
		empList.add(new Employee(103, "Neha"));
		empList.add(new Employee(102, "Rohit"));
		
		//method 1 -> using set
		
		Set<Employee> uniqueSet = new HashSet<Employee>(empList);
		
		Iterator<Employee> itr = uniqueSet.iterator();
		
		while(itr.hasNext()) {
			Employee e = itr.next();
			System.out.print(e.id + " -> " + e.name + " | ");
		}
		System.out.println();
		System.out.println("****************************");
		// method 2 -> using stream
		
		ListIterator<Employee> listIterator = empList.listIterator(empList.size());
		
		while (listIterator.hasPrevious()) {
			Employee previous = listIterator.previous();
			if(empList.indexOf(previous) != empList.lastIndexOf(previous))
				listIterator.remove();			
		}		
		
		for(Employee e: empList)
			System.out.print(e.id + " -> " + e.name + " | ");
	}
}
