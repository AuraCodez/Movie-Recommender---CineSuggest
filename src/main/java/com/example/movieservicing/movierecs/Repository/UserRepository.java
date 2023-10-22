package com.example.movieservicing.movierecs.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.movieservicing.movierecs.Model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByUserName(String userName);

    User findByEmail(String email);
}
