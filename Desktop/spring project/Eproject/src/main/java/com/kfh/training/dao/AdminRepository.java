package com.kfh.training.dao;

import org.springframework.data.repository.CrudRepository;

import com.kfh.training.entities.Admin;


public interface AdminRepository extends CrudRepository<Admin, Integer> {

}
