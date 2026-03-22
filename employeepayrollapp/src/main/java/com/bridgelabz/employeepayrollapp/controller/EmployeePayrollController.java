package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.service.EmployeePayrollService;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollService service;

    // GET ALL
    @GetMapping("/")
    public List<EmployeeDTO> getAll() {
        return service.getAllEmployees();
    }

    // GET BY ID
    @GetMapping("/get/{id}")
    public EmployeeDTO getById(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    // CREATE
    @PostMapping("/create")
    public EmployeeDTO create(@RequestBody EmployeeDTO emp) {
        return service.createEmployee(emp);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public EmployeeDTO update(@PathVariable Long id, @RequestBody EmployeeDTO emp) {
        return service.updateEmployee(id, emp);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteEmployee(id);
        return "Deleted Successfully";
    }
}