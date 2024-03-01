package com.example.movieservicing.movierecs.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.movieservicing.movierecs.model.Movie;
import com.example.movieservicing.movierecs.model.MoviesResponse;

@Service
public class TmdbMovieService implements TmdbEntityService<Movie> {
    @Value("${tmdb.api.base-url}")
    private String tmdbBaseUrl;

    @Value("${tmdb.api.key}")
    private String tmdbApiKey;

    private static final Logger logger = LoggerFactory.getLogger(TmdbMovieService.class);

    private final RestTemplate restTemplate;

    public TmdbMovieService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Map<String, Object> fetchPopular() {
        Map<String, Object> map = new HashMap<String, Object>();
        String urlEndpoint = String.format("%smovie/popular?api_key=%s", tmdbBaseUrl, tmdbApiKey);
        try {
            @SuppressWarnings("null")
            MoviesResponse moviesResponse = restTemplate.getForObject(urlEndpoint, MoviesResponse.class);
            if (moviesResponse != null && !moviesResponse.getResults().isEmpty()) {
                map.put("movies", moviesResponse.getResults());
                map.put("total_results", moviesResponse.getTotalResults());
                return map;
            }

        } catch (Exception e) {
            logger.error("Failed to get popular movies!");
        }

        return map;
    }

    public Map<String, Object> fetchTrending() {
        Map<String, Object> map = new HashMap<String, Object>();
        String urlEndpoint = String.format("%strending/movie/week?api_key=%s", tmdbBaseUrl, tmdbApiKey);
        try {
            MoviesResponse moviesResponse = restTemplate.getForObject(urlEndpoint, MoviesResponse.class);
            if (moviesResponse != null && !moviesResponse.getResults().isEmpty()) {
                map.put("movies", moviesResponse.getResults());
                map.put("total_results", moviesResponse.getTotalResults());
                return map;
            }
        } catch (Exception e) {
            logger.error("Failed to get trending movies!");
        }

        return map;
    }

}
