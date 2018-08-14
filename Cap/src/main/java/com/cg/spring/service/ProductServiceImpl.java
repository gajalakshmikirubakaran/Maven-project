package com.cg.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.bean.Product;
import com.cg.spring.repo.ProductRepo;

@Service

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	 ProductRepo repo;

	@Override
	public Optional<Product> getProductById(int pro_id) {
		
		return repo.findById(pro_id);
	}

}
