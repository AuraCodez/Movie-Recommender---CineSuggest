package com.example.movieservicing.movierecs.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuizResult {
    @JsonProperty("quizScore")
    private int quizScore;
    @JsonProperty("mood")
    private String mood;
    @JsonProperty("occasion")
    private String occasion;
    @JsonProperty("preferredGenre")
    private String preferredGenre;

    public QuizResult() {
    }

    public QuizResult(int quizScore, String mood, String occasion, String preferredGenre) {
        this.quizScore = quizScore;
        this.mood = mood;
        this.occasion = occasion;
        this.preferredGenre = preferredGenre;
    }

    public int getQuizScore() {
        return this.quizScore;
    }

    public void setQuizcore(int quizScore) {
        this.quizScore = quizScore;

    }

    public String getMood() {
        return this.mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getOccasion() {
        return this.occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getPreferredGenre() {
        return this.preferredGenre;
    }

    public void setPreferredGenre(String genre) {
        this.preferredGenre = genre;
    }

    @Override
    public String toString() {
        return "QuizResponse{" +
                "mood='" + mood + '\'' +
                ", occasion='" + occasion + '\'' +
                ", preferredGenre='" + preferredGenre + '\'' +
                '}';
    }

}
