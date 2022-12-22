package com.kfh.training.dao;

import org.springframework.data.repository.CrudRepository;

import com.kfh.training.entities.Category;


public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
