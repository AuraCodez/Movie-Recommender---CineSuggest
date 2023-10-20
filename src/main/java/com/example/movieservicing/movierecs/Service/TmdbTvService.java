package com.example.movieservicing.movierecs.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.example.movieservicing.movierecs.Model.Tv;
import com.example.movieservicing.movierecs.Model.TvResponse;

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

    @Override
    public List<Tv> fetchPopular() {
        String urlEndpoint = String.format("%s/tv/popular?api_key=%s", tmdbBaseUrl, tmdbApiKey);
        try {
            TvResponse tvResponse = restTemplate.getForObject(urlEndpoint, TvResponse.class);
            if (tvResponse != null && !tvResponse.getTvResponse().isEmpty()) {
                return tvResponse.getTvResponse();
            } 

        } catch (Exception e) {
            logger.error("Failed to get TV response API!");
        }

        return List.of();
    }

}
