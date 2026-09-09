package com.practice.collections.list.arraylist.employee3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

class TwoTopSalaries {

    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(105, "Rohit", "Finance", 90000.0));
        employees.add(new Employee(106, "Priya", "Finance", 85000.0));
        employees.add(new Employee(109, "Riya", "Finance", 80000.0));
        
        
        employees.add(new Employee(104, "Neha", "HR", 85000.0));
        employees.add(new Employee(108, "Sneha", "HR", 85000.0));
        employees.add(new Employee(102, "Rahul", "HR", 70000.0));
        
        employees.add(new Employee(103, "Ajay", "IT", 95000.0));//1
        employees.add(new Employee(107, "Vikas", "IT", 90000.0)); //2
        employees.add(new Employee(101, "Amit", "IT", 80000.0));
        
        
//        Map<String, TreeSet<Employee>> twoTopSal = new HashMap<>();
//
//        for (Employee emp : employees) {
//            // Get existing set for department or create a new one
//            twoTopSal.putIfAbsent(emp.department, new TreeSet<>());
//            TreeSet<Employee> deptSet = twoTopSal.get(emp.department);
//
//            deptSet.add(emp);
//            //Keep only 2 elements remove other 
//            // Since it is sorted descending, the lowest salary in the top set is at the end
//            if (deptSet.size() > 2) {
//                deptSet.pollLast(); 
//            }
//        }
//
//        // Print final map
//        for (Map.Entry<String, TreeSet<Employee>> entry : twoTopSal.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
        
        
        
        Map<String, TreeSet<Employee>> twoTopSal = new HashMap<>();
        
        for(Employee e: employees) {
        	
        	twoTopSal.putIfAbsent(e.department, new TreeSet<>());
        	
        	TreeSet<Employee> treeSet = twoTopSal.get(e.department);
        	
        	treeSet.add(e);
        	
        	if(treeSet.size() > 2) {
        		treeSet.pollLast();
        	}          	
        	
        }
        
        for(Entry<String, TreeSet<Employee>> map :twoTopSal.entrySet()) {
        	
        System.out.println(map.getKey() + " -> " + map.getValue());
        	
        }
        
    }
}