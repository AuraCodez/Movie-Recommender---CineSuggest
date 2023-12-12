package com.example.movieservicing.movierecs.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Map<String, Object>> getPopularTvShows() {
        Map<String, Object> popularTvShows = tvService.fetchPopular();
        return ResponseEntity.ok(popularTvShows);
    }

    @GetMapping("/trending")
    public ResponseEntity<Map<String, Object>> getTrendingTvForUsers() {
        Map<String, Object> trendingTvShows = tvService.fetchTrending();
        return ResponseEntity.ok(trendingTvShows);
    }

}
