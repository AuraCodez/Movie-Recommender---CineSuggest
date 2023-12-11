package com.example.movieservicing.movierecs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieservicing.movierecs.model.Movie;
import com.example.movieservicing.movierecs.service.TmdbMovieService;

@RestController
@RequestMapping("/movies")
public class MovieRecController {

    @Autowired
    public TmdbMovieService movieService;

    @GetMapping("/recommendations")
    public List<Movie> getRecommendationsForUser() {
        return movieService.fetchPopular();
    }

    @GetMapping("/trending")
    public List<Movie> getTrending() {
        return movieService.fetchTrending();
    }

}
