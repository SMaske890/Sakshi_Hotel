package com.rating.service.RatingService.services;

import com.rating.service.RatingService.enitities.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);

    //getAll ratings
    List<Rating> getAll();

    //get by userId
    List<Rating> getByUserId(String userId);

    //get by hotelId
    List<Rating> getByHotelId(String hotelId);


}
