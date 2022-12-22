package com.kfh.training.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfh.training.dao.ProductRepository;
import com.kfh.training.entities.Product;
import com.kfh.training.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

		@Autowired
		private ProductRepository productRepository;

		@Override
		public Product creatProduct(Product product) {return  productRepository.save(product);}

		@Override
		public void updateProduct(Product product) {productRepository.save(product);}

		@Override
		public Product getProduct(int id) {
			Optional <Product> optional=productRepository.findById(id);
			Product product=optional.get();
			return product;
		}

		@Override
		public List<Product> getProduct() {return (List<Product>)productRepository.findAll();}

		@Override
		public void deleteProduct(int id) {productRepository.deleteById(id);}

		@Override
		public boolean isProductExist(int id) {return productRepository.existsById(id);}
		
	

}
