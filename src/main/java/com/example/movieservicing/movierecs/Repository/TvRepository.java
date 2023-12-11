package com.example.movieservicing.movierecs.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.movieservicing.movierecs.model.Tv;

public interface TvRepository extends MongoRepository<Tv, String> {
    Tv findByOriginalTitle(String originalTitle);
    List<Tv> findByPopularity(double popularity);

}
