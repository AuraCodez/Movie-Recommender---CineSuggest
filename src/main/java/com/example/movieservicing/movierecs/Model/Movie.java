package com.example.movieservicing.movierecs.Model;

import java.util.List;
import org.springframework.data.annotation.Id;

public class Movie {
    @Id
    private String mongoDbID;
    private boolean adult;
    private List<Integer> genreIds;
    private Integer id;
    private String originalTitle;
    private String overview;
    private double popularity;
    private String releaseDate;
    private int voteAverage;
    private int voteCount;

    public Movie() {
    }

    public Movie(Integer id, String originalTitle, String overview, List<Integer> genreIds, double popularity,
            String releaseDate, int voteCount, int voteAverage) {
        this.id = id;
        this.originalTitle = originalTitle;
        this.overview = overview;
        this.genreIds = genreIds;
        this.popularity = popularity;
        this.releaseDate = releaseDate;
        this.voteCount = voteCount;
        this.voteAverage = voteAverage;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getTitle() {
        return originalTitle;
    }

    public void setTitle(String originalTitle) {
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

    public int getVoteAverage() {
        return voteAverage;
    }

    public List<Integer> getGenreIDS() {
        return genreIds;
    }

}
