package com.example.imdb.restcontroller;

import com.example.imdb.entity.UserReview;
import com.example.imdb.service.UserReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imdb")
public class ReviewAPI {

    @Autowired
    UserReviewService userReviewService;

    @PostMapping("/add")
    public String addReview(@RequestBody UserReview userReview)
    {
        userReviewService.addReview(userReview);
        return "added successfully";
    }

}
