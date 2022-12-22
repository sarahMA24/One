package com.kfh.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kfh.training.entities.Category;
import com.kfh.training.entities.User;
import com.kfh.training.exception.CategoryNotFoundException;
import com.kfh.training.exception.UserNotFoundException;
import com.kfh.training.services.CategoryService;
import com.kfh.training.services.UserService;

@RestController

public class CategoryServiceController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value="/category",method=RequestMethod.POST)
	public ResponseEntity<Object> creatCategory(@RequestBody Category category){
		category=categoryService.creatCategory(category);
		return new ResponseEntity<>("category is created successfully with id="+category.getC_id(),HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/category/{c_id}", method=RequestMethod.PUT)
	public ResponseEntity<Object> updateCategory(@PathVariable("c_id")int id,@RequestBody Category category){
		boolean isCategoryExist=categoryService.isCategoryExist(id);
		if(isCategoryExist) {
			category.setC_id(id);
			categoryService.updateCategory(category);
			return new ResponseEntity<>("Category is updated successfully",HttpStatus.OK);
		}else {
			throw new CategoryNotFoundException();
		}
	}
	
	@RequestMapping(value="/category",method=RequestMethod.GET)
	public ResponseEntity<Object> getCategory(){
		List<Category> categoryList=categoryService.getCategory();
		return new ResponseEntity<>(categoryList, HttpStatus.OK);
	}
	
	@RequestMapping(value="/category/{c_id}", method=RequestMethod.DELETE)//<--
	public ResponseEntity<Object> deleteCategory(@PathVariable("c_id")int id){
		boolean isCategoryExist=categoryService.isCategoryExist(id);
		if(isCategoryExist) {
			categoryService.deleteCategory(id);
			return new ResponseEntity<>("Category is deleted successfully",HttpStatus.OK);
		}else {
			throw new CategoryNotFoundException();
		}
	}
}
