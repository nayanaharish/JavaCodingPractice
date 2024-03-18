package com.example.reportgeneration.repo;

import com.example.reportgeneration.model.PlanName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanNameRepo extends JpaRepository<PlanName,Integer> {
}
