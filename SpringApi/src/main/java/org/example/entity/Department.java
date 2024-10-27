package org.example.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentid")
    private Long departmentId;

    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Employee> employees;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department(Long departmentId, Set<Employee> employees, String name) {
        this.departmentId = departmentId;
        this.employees = employees;
        this.name = name;
    }
}

