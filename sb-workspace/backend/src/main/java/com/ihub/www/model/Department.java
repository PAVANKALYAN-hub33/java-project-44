package com.ihub.www.model;

import jakarta.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptId; // Must be Capital Long

    private String deptName;
    private String designation;

    // Manually written Getters and Setters
    public Long getDeptId() { return deptId; }
    public void setDeptId(Long deptId) { this.deptId = deptId; }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { this.deptName = deptName; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }
}