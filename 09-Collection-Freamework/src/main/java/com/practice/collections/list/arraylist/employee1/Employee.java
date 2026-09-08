package com.practice.collections.list.arraylist.employee1;

import java.util.Objects;

class Employee {
	
	int id; String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(this == o) return true;
		if(!(o instanceof Employee)) return false;
		
		Employee e = (Employee) o;
		
		return this.id == e.id && Objects.equals(this.name, e.name);
			
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
}
