package com.example.proiectAplWebJava.service;

import com.example.proiectAplWebJava.exceptions.RatingException;
import com.example.proiectAplWebJava.model.Review;
import com.example.proiectAplWebJava.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review save (Review review) {
        if(review.getRating()>10 || review.getRating()<0)
            throw new RatingException("Rating has to be between 1 and 10.");
        return reviewRepository.save(review);}

    public List<Review> getAll() {
        return reviewRepository.findAll();
    }

    public Review getById(int id){ return reviewRepository.getById(id);}

    public boolean delete(int id){
        if (this.getById(id)!=null)
        {
            reviewRepository.deleteById(id);
            return true;
        }

        return false;
    }

    public List<Review> getTopThree(){
        return reviewRepository.findTopThreeReviews();
    }
}
