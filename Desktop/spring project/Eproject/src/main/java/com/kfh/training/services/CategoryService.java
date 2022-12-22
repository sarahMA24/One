package com.kfh.training.services;

import java.util.List;

import com.kfh.training.entities.Category;


public interface CategoryService {
	public abstract Category creatCategory(Category category);
	public abstract void updateCategory(Category category);
	public abstract Category getCategory(int id);
	public abstract List<Category> getCategory();
	public abstract void deleteCategory(int id);
	public abstract boolean isCategoryExist(int id);
}
