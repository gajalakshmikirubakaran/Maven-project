package com.cg.spring.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.bean.Product;


@Repository
public interface ProductRepo extends CrudRepository<Product,Integer>{

}
