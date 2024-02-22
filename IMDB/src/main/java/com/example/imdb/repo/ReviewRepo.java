package com.example.imdb.repo;

import com.example.imdb.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review,String> {
}
