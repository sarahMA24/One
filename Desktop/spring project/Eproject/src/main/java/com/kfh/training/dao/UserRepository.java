package com.kfh.training.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kfh.training.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
}
