package com.practice.collections.list.arraylist.employee3;

class Employee {
	
	int id; String name; String department; double salary;

	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee ( " + id +", "+ name +", "+ department+", " + salary + ")";
	}	
	
}
