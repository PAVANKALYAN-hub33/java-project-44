package com.ihub.www.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Must be Capital Long

    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date doj;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id")
    private Department dept;

    // Manually written Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getDoj() { return doj; }
    public void setDoj(Date doj) { this.doj = doj; }

    public Department getDept() { return dept; }
    public void setDept(Department dept) { this.dept = dept; }
}