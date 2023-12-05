package com.rating.service.RatingService.enitities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="ratings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @Id
    @Column(name="ID")
    private String ratingId;

    @Column(name="USERID")
    private String userId;

    @Column(name="HOTELID")
    private String hotelId;

    @Column(name="FEEDBACK")
    private String feedback;

    @Column(name="RATING")
    private int rating;




}
