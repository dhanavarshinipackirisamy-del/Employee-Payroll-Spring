package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;

public class Employee {

    private static int counter = 1;

    private int id;
    private String name;
    private long salary;

    public Employee(String name, long salary) {
        this.id = counter++;
        this.name = name;
        this.salary = salary;
    }

    public Employee(EmployeeDTO dto) {
        this.id = counter++;
        this.name = dto.getName();
        this.salary = dto.getSalary();
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public long getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setSalary(long salary) { this.salary = salary; }
}