package com.kfh.training.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {
private int c_id;
@Id
private String c_name;

public Category(int c_id, String c_name) {
	this.c_id = c_id;
	this.c_name = c_name;
}
public Category() {
	
}
public int getC_id() {
	return c_id;
}
public void setC_id(int c_id) {
	this.c_id = c_id;
}
public String getC_name() {
	return c_name;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}
@Override
public String toString() {
	return "Category [c_id=" + c_id + ", c_name=" + c_name + "]";
}


}
