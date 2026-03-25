package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
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

    public Employee getById(int id) {
        return list.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public Employee create(EmployeeDTO dto) {
        Employee emp = new Employee(dto);
        list.add(emp);
        return emp;
    }

    public Employee update(int id, EmployeeDTO dto) {
        Employee emp = getById(id);
        emp.setName(dto.getName());
        emp.setSalary(dto.getSalary());
        return emp;
    }

    public void delete(int id) {
        Employee emp = getById(id);
        list.remove(emp);
    }
}