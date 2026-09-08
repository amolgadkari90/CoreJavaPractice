package com.practice.collections.list.arraylist.employee2;

class Employee {
	
	int id; String name; double salary;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Employee)) return false;
		
		Employee e = (Employee) o;
		return this.id == e.id;
		
	}
	
}
