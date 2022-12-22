package com.kfh.training.services;

import java.util.List;

import com.kfh.training.entities.Admin;


public interface AdminService {
	public abstract Admin creatAdmin(Admin admin);
	public abstract void updateAdmin(Admin admin);
	public abstract Admin getAdmin(int id);
	public abstract List<Admin> getAdmin();
	public abstract void deleteAdmin(int id);
	public abstract boolean isAdminExist(int id);
}


