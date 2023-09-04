package com.example.movieservicing.movierecs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieservicing.movierecs.Service.RecService;

@RestController
public class MovieRecController {
    
    @Autowired
    public RecService movieService;

    

    
}
