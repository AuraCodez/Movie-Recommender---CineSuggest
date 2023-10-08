package com.example.movieservicing.movierecs.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;
import com.example.movieservicing.movierecs.Model.Movie;

public class TmdbMovieService implements TmdbEntityService<Movie> {
    @Value("${tmdb.api.base-url}")
    private String tmdbBaseUrl;

    @Value("${tmdb.api.key}")
    private String tmdbApiKey;

    // Use restTemplate field somewhere in the methods of the class to fix the error

    private final RestTemplate restTemplate;

    public TmdbMovieService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Movie> fetchPopular() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetchPopular'");
    }

    @Override
    public Movie fetchDetails(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetchDetails'");
    }

    



    
    
}
