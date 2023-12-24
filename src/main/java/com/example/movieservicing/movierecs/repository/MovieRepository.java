package com.example.movieservicing.movierecs.repository;

import org.springframework.stereotype.Repository;

import com.example.movieservicing.movierecs.model.Movie;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
    Movie findByOriginalTitle(String originalTitle);
    List<Movie> findByPopularity(double popularity);
}
