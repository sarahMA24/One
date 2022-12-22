package com.kfh.training.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfh.training.dao.CategoryRepository;
import com.kfh.training.entities.Category;
import com.kfh.training.services.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category creatCategory(Category category) {return  categoryRepository.save(category);}

	@Override
	public void updateCategory(Category category) {categoryRepository.save(category);}

	@Override
	public Category getCategory(int id) {
		Optional <Category> optional=categoryRepository.findById(id);
		Category category=optional.get();
		return category;
	}

	@Override
	public List<Category> getCategory() {return (List<Category>)categoryRepository.findAll();}

	@Override
	public void deleteCategory(int id) {categoryRepository.deleteById(id);}

	@Override
	public boolean isCategoryExist(int id) {return categoryRepository.existsById(id);}
	
}
