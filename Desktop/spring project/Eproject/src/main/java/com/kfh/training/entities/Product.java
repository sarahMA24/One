package com.kfh.training.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
private int p_id;
@Id
private String p_name;
private double p_price;
private String c_name;


Product(){
	
}


public Product(int p_id, String p_name, double p_price, String c_name) {
	this.p_id = p_id;
	this.p_name = p_name;
	this.p_price = p_price;
	this.c_name = c_name;
}


public int getP_id() {
	return p_id;
}
public void setP_id(int p_id) {
	this.p_id = p_id;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public double getP_price() {
	return p_price;
}
public void setP_price(double p_price) {
	this.p_price = p_price;
}
public String getC_name() {
	return c_name;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}


@Override
public String toString() {
	return "Product [p_id=" + p_id + ", p_name=" + p_name + ", p_price=" + p_price + ", c_name=" + c_name + "]";
}



}
