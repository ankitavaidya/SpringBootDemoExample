package com.movies.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movies.models.Movies;
import com.movies.repository.MoviesRepo;

@Service
public class MoviesService {
	
	@Autowired
	public MoviesRepo moviesRepo;
	
	private List<Movies> movies= new ArrayList<>();
	
	public List<Movies> getAllMovies() {
		moviesRepo.findAll().forEach(movies::add);
		return movies;
	}
	
	public void addMovies(Movies movies){
		moviesRepo.save(movies);
	}
	
	public void updateMovies(Movies movies, String id)
	{
		moviesRepo.save(movies);
	}
	
	public void deleteMovies(String id)
	{
		moviesRepo.deleteById(id);
	}
}
