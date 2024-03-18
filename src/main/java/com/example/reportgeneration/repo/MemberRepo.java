package com.example.reportgeneration.repo;

import com.example.reportgeneration.model.MemberInfo;
import com.example.reportgeneration.model.PlanName;
import com.example.reportgeneration.model.PlanStatus;
import io.swagger.v3.oas.models.examples.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepo extends  JpaRepository<MemberInfo,Integer> {
    @Query("select distinct (planName) from MemberInfo ")
    public List<String>   getPlanName();
    @Query("select distinct (planStatus) from MemberInfo ")
    public List<String> getPlanStatus();

    public List<MemberInfo> findAllByPlanNameAndPlanStatus(String planName,String planStatus);

    public List<MemberInfo> findAllByPlanName(String planName);
    public List<MemberInfo> findAllByPlanStatus(String planStatus);



}
