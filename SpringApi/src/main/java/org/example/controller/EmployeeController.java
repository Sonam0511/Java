package org.example.controller;

import org.example.entity.Employee;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.update(id, employee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
        employeeService.delete(id);
        return ResponseEntity.ok().build();
    }
}
