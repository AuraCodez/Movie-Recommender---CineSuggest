package com.example.movieservicing.movierecs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieservicing.movierecs.model.Tv;
import com.example.movieservicing.movierecs.service.TmdbTvService;

@RestController
@RequestMapping("/tv")
public class TvRecController {

    private final TmdbTvService tvService;

    @Autowired
    public TvRecController(TmdbTvService tvService) {
        this.tvService = tvService;
    }

    @GetMapping("/recommendations")
    public List<Tv> getRecommendationsForUser() {
        return tvService.fetchPopular();
    }

    @GetMapping("/trending")
    public List<Tv> getTrendingTvForUsers() {
        return tvService.fetchTrending();
    }

}
