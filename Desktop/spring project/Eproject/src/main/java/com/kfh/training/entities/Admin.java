package com.kfh.training.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
	@Id
private int a_id;
private String a_usename;
private String a_password;
private String a_email;

Admin(){
	
}

public Admin(int a_id, String a_usename, String a_password, String a_email) {
	this.a_id = a_id;
	this.a_usename = a_usename;
	this.a_password = a_password;
	this.a_email = a_email;
}

public int getA_id() {
	return a_id;
}

public void setA_id(int a_id) {
	this.a_id = a_id;
}

public String getA_usename() {
	return a_usename;
}

public void setA_usename(String a_usename) {
	this.a_usename = a_usename;
}

public String getA_password() {
	return a_password;
}

public void setA_password(String a_password) {
	this.a_password = a_password;
}

public String getA_email() {
	return a_email;
}

public void setA_email(String a_email) {
	this.a_email = a_email;
}

@Override
public String toString() {
	return "Admin [a_id=" + a_id + ", a_usename=" + a_usename + ", a_password=" + a_password + ", a_email=" + a_email
			+ "]";
}



}
