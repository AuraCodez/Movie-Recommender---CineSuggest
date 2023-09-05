package com.example.movieservicing.movierecs.Model;

public class Movie {
    private double rating;
    private String movieTitle;

    public Movie(double rating, String movieTitle) {
        this.rating = rating;
        this.movieTitle = movieTitle;
    }

    public double getMovieRating() {
        return this.rating;
    }

    public String getMovieTitle() {
        return this.movieTitle;
    }


}
