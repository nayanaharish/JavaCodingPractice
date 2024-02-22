package com.example.hotelapp.repos;

import com.example.hotelapp.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo extends JpaRepository<Orders,Integer> {

}
