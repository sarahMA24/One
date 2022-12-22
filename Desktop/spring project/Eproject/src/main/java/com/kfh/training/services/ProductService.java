package com.kfh.training.services;

import java.util.List;

import com.kfh.training.entities.Product;

public interface ProductService {
	public abstract Product creatProduct(Product product);
	public abstract void updateProduct(Product product);
	public abstract Product getProduct(int id);
	public abstract List<Product> getProduct();
	public abstract void deleteProduct(int id);
	public abstract boolean isProductExist(int id);
}
