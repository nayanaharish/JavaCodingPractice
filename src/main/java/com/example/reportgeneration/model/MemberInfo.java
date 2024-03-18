package com.example.reportgeneration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class MemberInfo {


    @Id
    @GeneratedValue
    private Integer sNo;
    private String name;
    private String email;
    private Long mobNum;
    private String gender;
    private Long ssn;
   private String planName;
   private String planStatus;


}
