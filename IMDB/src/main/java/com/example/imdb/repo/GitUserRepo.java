package com.example.imdb.repo;

import com.example.imdb.entity.GitUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GitUserRepo extends JpaRepository<GitUser,Integer> {

}
