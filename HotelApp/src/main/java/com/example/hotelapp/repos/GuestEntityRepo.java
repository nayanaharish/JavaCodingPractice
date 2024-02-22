package com.example.hotelapp.repos;

import com.example.hotelapp.entity.GuestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestEntityRepo extends JpaRepository<GuestEntity,Integer> {
}
