package com.example.ClimbingApp;

import jakarta.persistence.*;

@Entity
public class GymRating {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gym_id", referencedColumnName = "id")
    private Location gym;

    private double rating;
}
