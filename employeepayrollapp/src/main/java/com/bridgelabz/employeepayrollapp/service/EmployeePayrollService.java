package com.bridgelabz.employeepayrollapp.service;

import org.springframework.stereotype.Service;
import java.util.*;
import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;

@Service
public class EmployeePayrollService {

    private List<EmployeeDTO> employeeList = new ArrayList<>();
    private Long idCounter = 1L;

    // GET ALL
    public List<EmployeeDTO> getAllEmployees() {
        return employeeList;
    }

    // GET BY ID
    public EmployeeDTO getEmployeeById(Long id) {
        return employeeList.stream()
                .filter(emp -> emp.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // CREATE
    public EmployeeDTO createEmployee(EmployeeDTO emp) {
        emp.setId(idCounter++);
        employeeList.add(emp);
        return emp;
    }

    // UPDATE
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO emp) {
        for (EmployeeDTO e : employeeList) {
            if (e.getId().equals(id)) {
                e.setName(emp.getName());
                e.setSalary(emp.getSalary());
                return e;
            }
        }
        return null;
    }

    // DELETE
    public void deleteEmployee(Long id) {
        employeeList.removeIf(emp -> emp.getId().equals(id));
    }
}