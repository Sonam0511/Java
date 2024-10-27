package org.example.service;

import org.example.entity.Department;
import org.example.exception.ResourceNotFoundException;
import org.example.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    public Department save(Department department) {
        return departmentRepository.save(department);
    }
    public Optional<Department> findById(Long id) {
        return departmentRepository.findById(id);
    }


    public Department update(Long id, Department updatedDepartment) {
        return departmentRepository.findById(id)
                .map(department -> {
                    department.setName(updatedDepartment.getName());
                    return departmentRepository.save(department);
                }).orElseThrow(() -> new ResourceNotFoundException("Department not found with id " + id));
    }


    public void delete(Long id) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with id " + id));
        departmentRepository.delete(department);
    }
}
