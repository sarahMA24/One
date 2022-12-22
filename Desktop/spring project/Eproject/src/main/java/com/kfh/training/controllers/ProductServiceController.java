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

import com.kfh.training.entities.Product;
import com.kfh.training.exception.ProductNotFoundException;
import com.kfh.training.services.ProductService;


@RestController

public class ProductServiceController {

	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public ResponseEntity<Object> creatProduct(@RequestBody Product product){//<--
		product=productService.creatProduct(product);
		return new ResponseEntity<>("product is created successfully with id="+product.getP_id(),HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/product/{p_id}", method=RequestMethod.PUT)
	public ResponseEntity<Object> updateProduct(@PathVariable("p_id")int id,@RequestBody Product product){
		boolean isProductExist=productService.isProductExist(id);
		if(isProductExist) {
			product.setP_id(id);
			productService.updateProduct(product);
			return new ResponseEntity<>("product is updated successfully",HttpStatus.OK);
		}else {
			throw new ProductNotFoundException();
		}
	}
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public ResponseEntity<Object> getProduct(){
		List<Product> productList=productService.getProduct();
		return new ResponseEntity<>(productList, HttpStatus.OK);
	}
	
	@RequestMapping(value="/product/{p_id}", method=RequestMethod.DELETE)//<--
	public ResponseEntity<Object> deleteProduct(@PathVariable("p_id")int id){
		boolean isProductExist=productService.isProductExist(id);
		if(isProductExist) {
			productService.deleteProduct(id);
			return new ResponseEntity<>("product is deleted successfully",HttpStatus.OK);
		}else {
			throw new ProductNotFoundException();
		}
	}


}
