package com.example.movieservicing.movierecs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieservicing.movierecs.model.QuizResult;
import com.example.movieservicing.movierecs.service.TmdbMovieService;

@RestController
@RequestMapping("/movies")
public class MovieRecController {

    private final TmdbMovieService movieService;

    @Autowired
    public MovieRecController(TmdbMovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/recommendations")
    public ResponseEntity<Map<String, Object>> getPopularMovies() {
        Map<String, Object> popularMovies = movieService.fetchPopular();
        return ResponseEntity.ok(popularMovies);

    }

    @GetMapping("/trending")
    public ResponseEntity<Map<String, Object>> getTrendingForMovies() {
        Map<String, Object> trendingMovies = movieService.fetchTrending();
        return ResponseEntity.ok(trendingMovies);
    }

    @PostMapping("/user_recommendations")
    public ResponseEntity<Map<String, Object>> getMovieRecommendationForUser(@RequestBody QuizResult quizResponse) {
        System.out.println(quizResponse);
        // TODO: Get the movie recommendations for user
        return null;
    }

}
