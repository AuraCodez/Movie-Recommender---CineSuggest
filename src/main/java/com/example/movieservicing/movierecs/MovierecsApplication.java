package com.example.movieservicing.movierecs;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.movieservicing.movierecs.model.Movie;
import com.example.movieservicing.movierecs.model.User;
import com.example.movieservicing.movierecs.repository.MovieRepository;
import com.example.movieservicing.movierecs.repository.UserRepository;

@SpringBootApplication
public class MovierecsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovierecsApplication.class, args);
	}

	@Bean
	CommandLineRunner demoData(MovieRepository movieRepository, UserRepository userRepository) {
		return args -> {
			// movieRepository.save(new Movie("Amongus", 99.0));
			// movieRepository.save(new Movie("Idk", 99.0));
			// List<Movie> movies = movieRepository.findByPopularity(99.0);
			// userRepository.save(new User("Ryan"));
		};
	}

}
