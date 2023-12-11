package com.example.movieservicing.movierecs.controller;

import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.movieservicing.movierecs.model.Genre;
import com.example.movieservicing.movierecs.service.GenreService;

@RestController
@RequestMapping
public class GenreController {

    private final GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @RequestMapping(value = "/genres", method = RequestMethod.GET)
    public ResponseEntity<Map<String, List<Genre>>> getGenres() {
        List<Genre> genres = genreService.getMovieGenres();
        Map<String, List<Genre>> map = new HashMap<String, List<Genre>>();
        map.put("genres", genres);
        return ResponseEntity.ok(map);
    }

}
