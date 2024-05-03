package com.example.ClimbingApp;

import org.springframework.data.repository.CrudRepository;
import com.example.ClimbingApp.Location;
public interface LocationRepository extends CrudRepository<Location, Integer> {

}