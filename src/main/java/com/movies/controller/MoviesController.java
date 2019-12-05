package com.movies.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.movies.models.Movies;
import com.movies.services.MoviesService;

@RestController //Rest APIs 
public class MoviesController 
{
	@Autowired //injects the created instance 
	private MoviesService moviesService;
	
	@RequestMapping("/movies") //maps the request for particular route
	public List<Movies> getAllMovies() {
		return moviesService.getAllMovies();
	}
	
	@RequestMapping("/movies/storedprocedure")
	public List<Movies> getMoviesList()
	{
		List<Movies> movie= moviesService.getDiscount();
	    return movie;
	}
	
	@RequestMapping("/{promo_code}/{coupon_code}")
	public List<Movies> getAllByPromoCode(@PathVariable String promo_code,@PathVariable String coupon_code)
	{
		return (List<Movies>) moviesService.getListByPromoCode(promo_code,coupon_code);
	}
	
	@RequestMapping(value="/moviesAdd", method= RequestMethod.POST)
	public void addMovies(@RequestBody Movies movies) 
	{
		moviesService.addMovies(movies);
	}
	
	@RequestMapping(value="/update/{id}",method= RequestMethod.PUT)
	public void updateMovies(@RequestBody Movies movies, @PathVariable String id)
	{
		moviesService.updateMovies(movies, id);
	}
	
	@RequestMapping(value="/delete/{id}",method= RequestMethod.DELETE)
	public void deleteMovies(@PathVariable String id) //arg passed is actually a variable
	{
		moviesService.deleteMovies(id);
	}
}
