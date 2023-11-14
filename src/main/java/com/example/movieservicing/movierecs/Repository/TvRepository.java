package com.example.movieservicing.movierecs.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.movieservicing.movierecs.Model.Tv;

public interface TvRepository extends MongoRepository<Tv, String> {
    Tv findByName(String originalName);
    List<Tv> findByPopularity(double popularity);

}
