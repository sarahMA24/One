package com.kfh.training.dao;

import org.springframework.data.repository.CrudRepository;

import com.kfh.training.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
