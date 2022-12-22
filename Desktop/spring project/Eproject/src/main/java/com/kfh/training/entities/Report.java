package com.kfh.training.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Report {
@Id
private int r_id;
private String p_name;
private String c_category;
private String u_user;
private Date r_date;

Report(){
	
}

public Report(int r_id, String p_name, String c_category, String u_user, Date r_date) {
	
	this.r_id = r_id;
	this.p_name = p_name;
	this.c_category = c_category;
	this.u_user = u_user;
	this.r_date = r_date;
}
public int getR_id() {
	return r_id;
}
public void setR_id(int r_id) {
	this.r_id = r_id;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public String getC_category() {
	return c_category;
}
public void setC_category(String c_category) {
	this.c_category = c_category;
}
public String getU_user() {
	return u_user;
}
public void setU_user(String u_user) {
	this.u_user = u_user;
}
public Date getR_date() {
	return r_date;
}
public void setR_date(Date r_date) {
	this.r_date = r_date;
}
@Override
public String toString() {
	return "Report [r_id=" + r_id + ", p_name=" + p_name + ", c_category=" + c_category + ", u_user=" + u_user
			+ ", r_date=" + r_date + "]";
}



}
