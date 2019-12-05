package com.movies.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //creates table with following rows

public class Movies 
{
	@Id //primary key
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	
	@Column(name="type")
	private String type;
	
	@Column (name="promo_code")
	private String promo_code;
	
	@Column (name="coupon_code")
	private String coupon_code;
	
	@Column (name="discount_code")
	private String discount_code;
	


	public Movies() {
		
	}

	public Movies(int id, String name, String type, String promo_code, String coupon_code, String discount_code) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.promo_code = promo_code;
		this.coupon_code = coupon_code;
		this.discount_code = discount_code;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getPromo_code() {
		return promo_code;
	}

	public void setPromo_code(String promo_code) {
		this.promo_code = promo_code;
	}

	public String getCoupon_code() {
		return coupon_code;
	}

	public void setCoupon_code(String coupon_code) {
		this.coupon_code = coupon_code;
	}

	public String getDiscount_code() {
		return discount_code;
	}

	public void setDiscount_code(String discount_code) {
		this.discount_code = discount_code;
	}
}
