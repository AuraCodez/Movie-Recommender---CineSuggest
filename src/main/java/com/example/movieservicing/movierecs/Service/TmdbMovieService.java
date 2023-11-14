package com.example.movieservicing.movierecs.Service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.movieservicing.movierecs.Model.Movie;
import com.example.movieservicing.movierecs.Model.MoviesResponse;

@Service
public class TmdbMovieService implements TmdbEntityService<Movie> {
    @Value("${tmdb.api.base-url}")
    private String tmdbBaseUrl;

    @Value("${tmdb.api.key}")
    private String tmdbApiKey;

    private static final Logger logger = LoggerFactory.getLogger(TmdbMovieService.class);

    // Use restTemplate field somewhere in the methods of the class to fix the error

    private final RestTemplate restTemplate;

    public TmdbMovieService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override // // PopularMovies returns popular movies response
    public List<Movie> fetchPopular() {
        String urlEndpoint = String.format("%s/movie/popular?api_key=%s", tmdbBaseUrl, tmdbApiKey);
        try {
            MoviesResponse moviesResponse = restTemplate.getForObject(urlEndpoint, MoviesResponse.class);
            if (moviesResponse != null && !moviesResponse.getMovieResponse().isEmpty()) {
                return moviesResponse.getMovieResponse();
            }

        } catch (Exception e) {
            logger.error("Failed to get movies response API!");
        }

        return List.of();
    }

}
