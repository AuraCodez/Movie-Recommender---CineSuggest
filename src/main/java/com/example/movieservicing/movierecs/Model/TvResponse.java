package com.example.movieservicing.movierecs.Model;

import java.util.List;

public class TvResponse {
    private int page;
    private List<Tv> results;
    private int totalPages;
    private int totalResults;

    public List<Tv> getTvResponse() {
        return results;
    }

}
