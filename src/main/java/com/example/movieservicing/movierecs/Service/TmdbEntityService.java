package com.example.movieservicing.movierecs.Service;

import java.util.List;

public interface TmdbEntityService<T> {
    List<T> fetchPopular();
    T fetchDetails(Long id);
}