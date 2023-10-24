package com.example.movieservicing.movierecs.CustomData;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.example.movieservicing.movierecs.Model.Movie;
import com.example.movieservicing.movierecs.Repository.MovieRepository;

public class DemoData {
    @Bean
    public CommandLineRunner demoData(MovieRepository movieRepository) {
        return args -> {
            movieRepository.save(new Movie("Movie 1"));
            movieRepository.save(new Movie("Movie 2"));
        };
    }
}
