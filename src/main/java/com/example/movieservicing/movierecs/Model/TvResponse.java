package com.example.movieservicing.movierecs.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TvResponse {
   private List<Tv> results;
   private int page;

   @JsonProperty("total_results")
   private int totalResults;

   @JsonProperty("total_pages")
   private int totalPages;

   public List<Tv> getResults() {
      return results;
   }

   public int getTotalResults() {
      return totalResults;
   }

   public int getPage() {
      return page;
   }

   public int getTotalPages() {
      return totalPages;
   }

}
