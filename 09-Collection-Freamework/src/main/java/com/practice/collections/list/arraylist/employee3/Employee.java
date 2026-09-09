package com.practice.collections.list.arraylist.employee3;

class Employee implements Comparable<Employee> {
    
    int id; 
    String name; 
    String department; 
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee (" + id + ", " + name + ", " + department + ", " + salary + ")";
    }

    @Override
    public int compareTo(Employee e) {
        // Primary sort: Salary descending (highest to lowest)
        int salaryComparison = Double.compare(e.salary, this.salary);
        
        // Secondary sort: ID ascending (tie-breaker to prevent dropping employees with identical salaries)
        if (salaryComparison != 0) {
            return salaryComparison;
        }
        return Integer.compare(this.id, e.id);
    }   
}