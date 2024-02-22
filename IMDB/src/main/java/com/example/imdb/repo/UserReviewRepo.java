package com.example.imdb.repo;

import com.example.imdb.entity.UserReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReviewRepo extends JpaRepository<UserReview,String> {
}
