package com.kfh.training.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfh.training.dao.UserRepository;
import com.kfh.training.entities.User;
import com.kfh.training.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User creatUser(User user) {return userRepository.save(user);}

	@Override
	public void updateUser(User user) {userRepository.save(user);}

	@Override
	public User getUser(int id) {
		Optional <User> optional=userRepository.findById(id);
		User user=optional.get();
		return user;
	}

	@Override
	public List<User> getUser() {return (List<User>)userRepository.findAll();}

	@Override
	public void deleteUser(int id) {userRepository.deleteById(id);}

	@Override
	public boolean isUserExist(int id) {return userRepository.existsById(id);}

}
