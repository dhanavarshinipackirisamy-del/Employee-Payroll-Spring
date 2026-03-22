package com.bridgelabz.employeepayrollapp.dto;

public class EmployeeDTO {

    private Long id;
    private String name;
    private double salary;

    // Default constructor
    public EmployeeDTO() {}

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}