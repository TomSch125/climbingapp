package com.example.ClimbingApp;

import org.springframework.data.repository.CrudRepository;
import com.example.ClimbingApp.Climb;
public interface ClimbRepository extends CrudRepository<Climb, Integer> {

}