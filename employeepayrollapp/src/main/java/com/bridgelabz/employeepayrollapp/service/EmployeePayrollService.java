package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService {

    private final List<Employee> list = new ArrayList<>();

    public List<Employee> getAll() {
        return list;
    }

    public Employee create(String name, long salary) {
        Employee emp = new Employee(name, salary);
        list.add(emp);
        return emp;
    }
}