package com.movies.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.movies.models.Movies;

public interface MoviesRepo extends JpaRepository<Movies, String>{

	@Transactional
	@Query(value="{call sample_procedure}",nativeQuery=true)
	List<Movies> findByProcedure();
	
	@Transactional
	@Query(value="{call sample_param(:promo_code,:coupon_code)}",nativeQuery=true)
	List<Movies> findByPromoCode(@Param("promo_code") String promo_code, @Param("coupon_code") String coupon_code);
	
}
