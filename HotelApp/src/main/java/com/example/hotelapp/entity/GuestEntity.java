package com.example.hotelapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GuestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer guestId;

    private String firstName;
    private String lastName;

    @OneToOne
    private Address address;

    @OneToMany
    private List<Review> reviews;

    @ManyToMany
    private List<Orders> ordersList;




}
