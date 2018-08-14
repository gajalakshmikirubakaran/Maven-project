package com.cg.spring.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	public Product(int pro_id, String pro_name, String pro_model, int pro_price) {
		super();
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.pro_model = pro_model;
		this.pro_price = pro_price;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pro_id;
	@Column(name="product_name")
	String pro_name;
	@Column(name="product_model")
	String pro_model;
	@Column(name="product_price")
	int pro_price;
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getPro_model() {
		return pro_model;
	}
	public void setPro_model(String pro_model) {
		this.pro_model = pro_model;
	}
	public int getPro_price() {
		return pro_price;
	}
	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}
public 	Product(){}

}
