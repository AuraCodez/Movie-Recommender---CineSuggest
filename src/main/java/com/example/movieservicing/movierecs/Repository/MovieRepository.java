package com.example.movieservicing.movierecs.Repository;

import org.springframework.stereotype.Repository;

import com.example.movieservicing.movierecs.Model.Movie;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
    Movie findByOriginalTitle(String originalTitle);
    List<Movie> findByPopularity(double popularity);
}
