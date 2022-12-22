package com.kfh.training.entities;

import jakarta.persistence.Column;

//import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
//@Column(name="u_id")
//private int id;
private int u_id;
//@Column(name="u_name")
//private String name;
private String u_name;
////@Column(name="u_email")
//private String email;
private String u_email;
////@Column(name="u_password")
//private String password;
private String u_password;


User(){
	
}


public int getU_id() {
	return u_id;
}


public void setU_id(int u_id) {
	this.u_id = u_id;
}


public String getU_name() {
	return u_name;
}


public void setU_name(String u_name) {
	this.u_name = u_name;
}


public String getU_email() {
	return u_email;
}


public void setU_email(String u_email) {
	this.u_email = u_email;
}


public String getU_password() {
	return u_password;
}


public void setU_password(String u_password) {
	this.u_password = u_password;
}


public User(int u_id, String u_name, String u_email, String u_password) {
	super();
	this.u_id = u_id;
	this.u_name = u_name;
	this.u_email = u_email;
	this.u_password = u_password;
}


@Override
public String toString() {
	return "User [u_id=" + u_id + ", u_name=" + u_name + ", u_email=" + u_email + ", u_password=" + u_password + "]";
}






}
