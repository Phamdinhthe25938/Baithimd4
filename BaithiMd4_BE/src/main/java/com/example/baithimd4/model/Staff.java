package com.example.baithimd4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codeStaff;

    private String nameStaff;

    private int ageStaff;

    private double salaryStaff;

    @ManyToOne
    private  Branch branch;
}
