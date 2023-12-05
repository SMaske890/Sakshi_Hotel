package com.rating.service.RatingService.repositories;

import com.rating.service.RatingService.enitities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepo extends JpaRepository<Rating, String> {

    //get ratings by userId
    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
}
