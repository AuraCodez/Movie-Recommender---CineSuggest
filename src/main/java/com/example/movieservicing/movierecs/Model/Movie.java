package com.example.movieservicing.movierecs.Model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;

public class Movie {
    @Id
    private Integer id;
    private boolean adult;
    private String backdropPath;
    private List<Integer> genreIds = new ArrayList<>();
    private String originalLanguage;
    private String originalTitle;
    private String overview;
    private double popularity;
    private String posterPath;
    private String releaseDate;
    private String title;
    private boolean video;
    private double voteAverage;
    private int voteCount;

    public Movie() {
    }

    public Movie(String originalTitle, double popularity) {
        this.originalTitle = originalTitle;
        this.popularity = popularity;
    }

    public Movie(String originalTitle, String overview, List<Integer> genreIds, double popularity,
            String releaseDate, int voteCount, int voteAverage) {
        this.originalTitle = originalTitle;
        this.overview = overview;
        this.genreIds = genreIds;
        this.popularity = popularity;
        this.releaseDate = releaseDate;
        this.voteCount = voteCount;
        this.voteAverage = voteAverage;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public boolean isAdult() {
        return adult;
    }

    public boolean isVideo() {
        return video;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;

    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public List<Integer> getGenreIDS() {
        return genreIds;
    }

}
