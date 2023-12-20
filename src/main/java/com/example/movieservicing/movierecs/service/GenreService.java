package com.example.movieservicing.movierecs.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.movieservicing.movierecs.model.Genre;
import com.example.movieservicing.movierecs.model.GenreResponse;

@Service
public class GenreService {
    @Value("${tmdb.api.base-url}")
    private String tmdbBaseUrl;

    @Value("${tmdb.api.key}")
    private String tmdbApiKey;

    private static final Logger logger = LoggerFactory.getLogger(GenreService.class);

    private final RestTemplate restTemplate;

    public GenreService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Genre> getMovieGenres() {
        String urlEndpoint = String.format("%sgenre/movie/list?api_key=%s", tmdbBaseUrl, tmdbApiKey);
        try {
            GenreResponse genreResponse = restTemplate.getForObject(urlEndpoint, GenreResponse.class);
            if (genreResponse != null && !genreResponse.getGenres().isEmpty()) {
                return genreResponse.getGenres();
            }

        } catch (Exception e) {
            logger.error("Failed to get genres!");
        }

        return List.of();

    }

}
