package com.example.ClimbingApp.Entities;

import jakarta.persistence.*;

@Entity
//@IdClass(GymRatingId.class)
public class GymRating {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gym_id", referencedColumnName = "id")
    private Location gym;

    private double rating;
}
