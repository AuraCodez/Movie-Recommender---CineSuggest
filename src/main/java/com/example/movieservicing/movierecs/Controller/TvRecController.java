package com.example.movieservicing.movierecs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieservicing.movierecs.Model.Tv;
import com.example.movieservicing.movierecs.Service.TmdbTvService;

@RestController
@RequestMapping("/tv")
public class TvRecController {

    @Autowired
    private TmdbTvService tvRecService;

    @GetMapping("/recommendations")
    public List<Tv> getRecommendationsForUser() {
        return tvRecService.fetchPopular();
    }

}
