package com.cg.spring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.bean.Product;
import com.cg.spring.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService service;
	@RequestMapping("/getproducts")
	public Optional <Product> getProductById(@RequestParam String pro_id){
		return service.getProductById(Integer.parseInt(pro_id));
		
	}

}
