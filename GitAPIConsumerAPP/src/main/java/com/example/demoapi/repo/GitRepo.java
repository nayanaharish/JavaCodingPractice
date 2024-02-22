package com.example.demoapi.repo;

import com.example.demoapi.dto.GitUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GitRepo extends JpaRepository<GitUser, Integer> {
    public Optional<GitUser> findByLogin(String name);

}
