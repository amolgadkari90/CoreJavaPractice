package com.practice.collections.list.arraylist.employee;

class Employee {
	
	String name;

	public Employee(String name) {
		super();
		this.name = name;
	}	
	
	@Override
	public boolean equals(Object o) {
		
		if(!(o instanceof  Employee)) {
			return false;
		}
		
		Employee e = (Employee) o;	
		
		return java.util.Objects.equals(this.name, e.name);	
		
	}
}
