package com.example.baithimd4.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Branch {
    @Id
    private int idBranch;

    private String nameBranch;
}
