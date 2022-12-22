package com.kfh.training.services;

import java.util.List;

import com.kfh.training.entities.User;
public interface UserService {
	public abstract User creatUser(User user);
	public abstract void updateUser(User user);
	public abstract User getUser(int id);
	public abstract List<User> getUser();
	public abstract void deleteUser(int id);
	public abstract boolean isUserExist(int id);

}
