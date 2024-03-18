package com.example.reportgeneration.repo;

import com.example.reportgeneration.model.PlanStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanStatusRepo extends JpaRepository<PlanStatus,Integer> {
}
