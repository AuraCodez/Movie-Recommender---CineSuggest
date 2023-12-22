package com.example.movieservicing.movierecs.service;

import java.util.Map;

public interface TmdbEntityService<T> {
    Map<String, Object>  fetchPopular();
    Map<String, Object>  fetchTrending();

}