package com.example.movieservicing.movierecs.service;

import java.util.List;

public interface TmdbEntityService<T> {
    List<T> fetchPopular();
    List<T> fetchTrending();
    
}