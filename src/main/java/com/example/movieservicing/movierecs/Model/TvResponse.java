package com.example.movieservicing.movierecs.Model;

import java.util.List;

public class TvResponse {
    private int page;
    private List<Tv> results;

    public List<Tv> getTvResponse() {
        return results;
    }
    
}
