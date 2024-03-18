package com.example.reportgeneration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PlanStatus {

    @Id
    @GeneratedValue
    private Integer id;
    private String status;

}
