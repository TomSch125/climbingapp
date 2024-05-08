package com.example.ClimbingApp.Repos;

import org.springframework.data.repository.CrudRepository;
import com.example.ClimbingApp.Entities.Location;
public interface LocationRepository extends CrudRepository<Location, Integer> {

}