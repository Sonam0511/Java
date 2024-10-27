package org.example.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employeeid")
    private Long employeeId;
    private String name;

    @ManyToOne
    @JoinColumn(name = "departmentid", nullable = false)
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(Department department, Long employeeId, String name) {
        this.department = department;
        this.employeeId = employeeId;
        this.name = name;
    }
}

