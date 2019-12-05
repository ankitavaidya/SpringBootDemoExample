package com.movies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.movies.models.Movies;

public interface MoviesRepo extends JpaRepository<Movies, String>{

	@Query(value="SELECT * FROM movies m WHERE m.promo_code = ?1 and m.coupon_code=?2",nativeQuery=true)
	List<Movies> findByPromoCode(String promo_code, String coupon_code);
	
}
