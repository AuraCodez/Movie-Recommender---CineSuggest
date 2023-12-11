package com.example.movieservicing.movierecs.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.movieservicing.movierecs.model.Tv;
import com.example.movieservicing.movierecs.model.TvResponse;

@Service
public class TmdbTvService implements TmdbEntityService<Tv> {
    @Value("${tmdb.api.base-url}")
    private String tmdbBaseUrl;

    @Value("${tmdb.api.key}")
    private String tmdbApiKey;

    private final RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(TmdbMovieService.class);

    public TmdbTvService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Tv> fetchPopular() {
        String urlEndpoint = String.format("%stv/popular?api_key=%s", tmdbBaseUrl, tmdbApiKey);
        try {
            TvResponse tvResponse = restTemplate.getForObject(urlEndpoint, TvResponse.class);
            if (tvResponse != null && !tvResponse.getResults().isEmpty()) {
                return tvResponse.getResults();
            }

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Failed to get popular TV shows!");
        }

        return List.of();
    }

    public List<Tv> fetchTrending() {
        String urlEndpoint = String.format("%strending/tv/week?api_key=%s", tmdbBaseUrl, tmdbApiKey);
        try {
            TvResponse tvResponse = restTemplate.getForObject(urlEndpoint, TvResponse.class);
            if (tvResponse != null && !tvResponse.getResults().isEmpty()) {
                return tvResponse.getResults();
            }

        } catch(Exception e) {
            logger.error("Failed to get trending TV shows!");

        }
        return List.of();
    }

}
