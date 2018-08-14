package com.cg.spring.service;

import java.util.Optional;

import com.cg.spring.bean.Product;



public interface ProductService {

	public Optional<Product> getProductById(int pro_id);
	

}
         