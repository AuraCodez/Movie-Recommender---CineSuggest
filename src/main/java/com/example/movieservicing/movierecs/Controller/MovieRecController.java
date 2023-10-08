package com.example.movieservicing.movierecs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieservicing.movierecs.Model.Movie;
import com.example.movieservicing.movierecs.Service.TmdbMovieService;

@RestController
@RequestMapping("/movies")
public class MovieRecController {
    
    @Autowired
    public TmdbMovieService movieService;

    @GetMapping("/movies/recommendations")
    public List<Movie> getRecommendationsForUser() {
        return movieService.fetchPopular();
    }

    @GetMapping("/movies/ratings")
    public int getRatings() {
        return 0;
    }
    
}
