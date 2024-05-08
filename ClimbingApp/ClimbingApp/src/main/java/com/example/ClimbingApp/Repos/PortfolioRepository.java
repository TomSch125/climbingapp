package com.example.ClimbingApp.Repos;

import org.springframework.data.repository.CrudRepository;
import com.example.ClimbingApp.Entities.Portfolio;
public interface PortfolioRepository extends CrudRepository<Portfolio, Integer> {

}