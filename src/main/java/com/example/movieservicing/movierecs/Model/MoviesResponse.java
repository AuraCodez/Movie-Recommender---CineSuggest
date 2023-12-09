package com.example.movieservicing.movierecs.Model;

import java.util.List;

public class MoviesResponse {
   private List<Movie> results;
   private int page;
   private int totalPages;
   private int totalResults;

   public List<Movie> getMovieResponse() {
      return results;
   }

   public int getPage() {
      return page;
   }

   public int getTotalPages() {
      return totalPages;
   }

   public int totalResults() {
      return totalResults;
   }
}
