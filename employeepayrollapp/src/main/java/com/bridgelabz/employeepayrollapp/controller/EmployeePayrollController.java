package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.web.bind.annotation.*;
import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    // GET
    @GetMapping("/")
    public String getAll() {
        return "Get all employees";
    }

    // GET BY ID
    @GetMapping("/get/{id}")
    public String getById(@PathVariable Long id) {
        return "Get employee with ID: " + id;
    }

    // POST
    @PostMapping("/create")
    public String create(@RequestBody EmployeeDTO emp) {
        return "Employee created: " + emp.getName();
    }

    // PUT
    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody EmployeeDTO emp) {
        return "Employee updated: " + id;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return "Employee deleted: " + id;
    }
}