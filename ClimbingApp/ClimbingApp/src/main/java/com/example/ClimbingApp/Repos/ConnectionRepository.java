package com.example.ClimbingApp.Repos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.ClimbingApp.Entities.Connection;

import java.util.List;

public interface ConnectionRepository extends CrudRepository<Connection, Integer> {
    @Query(value ="SELECT c FROM Connection c WHERE c.user_id = ?1", nativeQuery = true)
    List<Connection> findFriends(Integer id);
}
