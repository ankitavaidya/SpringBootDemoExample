package com.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.models.Movies;

public interface MoviesRepo extends JpaRepository<Movies, String>{

}
