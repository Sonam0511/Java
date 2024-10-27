package org.example.controller;

import org.example.entity.Department;
import org.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.findAll();
    }

    @PostMapping("/create")
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.save(department);
    }

    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable Long id, @RequestBody Department department) {
        return departmentService.update(id, department);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDepartment(@PathVariable Long id) {
        departmentService.delete(id);
        return ResponseEntity.ok().build();
    }
}

