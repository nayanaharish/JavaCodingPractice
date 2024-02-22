package com.example.imdb.service;

import com.example.imdb.client.GitConsumer;
import com.example.imdb.entity.GitUser;
import com.example.imdb.entity.UserReview;
import com.example.imdb.repo.GitUserRepo;
import com.example.imdb.repo.ReviewRepo;
import com.example.imdb.repo.UserReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserReviewService {

    @Autowired
    GitUserRepo gitUserRepo;
    @Autowired
    UserReviewRepo userReviewRepo;
    @Autowired
    ReviewRepo reviewRepo;

    @Autowired
    GitConsumer gitConsumer;


    public ResponseEntity<String> addReview(UserReview userReview)
    {
        reviewRepo.saveAll(userReview.getReviews());
        gitUserRepo.save(getGitUser(userReview.getLoginName()));
        userReviewRepo.save(userReview);
        return new ResponseEntity<>("Addedd Successfully", HttpStatus.CREATED);
    }

    public GitUser getGitUser(String gitUser)
    {
        GitUser gitUser1 = gitConsumer.getGitUser(gitUser);
        return gitUser1;

    }

}
