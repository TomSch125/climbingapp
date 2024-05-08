package com.example.ClimbingApp.Repos;

import org.springframework.data.repository.CrudRepository;
import com.example.ClimbingApp.Entities.Climb;
public interface ClimbRepository extends CrudRepository<Climb, Integer> {

}