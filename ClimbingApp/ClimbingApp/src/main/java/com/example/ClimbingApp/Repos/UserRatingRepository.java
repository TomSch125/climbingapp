package com.example.ClimbingApp.Repos;

import org.springframework.data.repository.CrudRepository;
import com.example.ClimbingApp.Entities.User_rating;
public interface UserRatingRepository extends CrudRepository<User_rating, Integer> {

}