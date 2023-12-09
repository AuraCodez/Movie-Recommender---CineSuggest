package com.example.movieservicing.movierecs.Model;

import org.springframework.data.annotation.Id;

public class Tv {
    @Id
    private String name;
    private String firstAirDate;
    private String orginCountry;
    private String originalName;
    private String overview;
    private double popularity;

    public Tv() {

    }

    public Tv(String originalName, double popularity, String overview) {
        this.originalName = originalName;
        this.popularity = popularity;
        this.overview = overview;
    }

    public String getTvTitle() {
        return originalName;
    }

    public String getOverview() {
        return overview;
    }

    public double getPopularity() {
        return popularity;
    }

}
