package com.example.ClimbingApp.Repos;

import org.springframework.data.repository.CrudRepository;
import com.example.ClimbingApp.Entities.Route;
public interface RouteRepository extends CrudRepository<Route, Integer> {

}