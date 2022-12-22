package com.kfh.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kfh.training.entities.User;
import com.kfh.training.exception.UserNotFoundException;
import com.kfh.training.services.UserService;

@RestController
public class UserServiceController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public ResponseEntity<Object> creatUser(@RequestBody User user){
		user=userService.creatUser(user);
		return new ResponseEntity<>("User is created successfully with id="+user.getU_id(),HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/user/{u_id}", method=RequestMethod.PUT)
	public ResponseEntity<Object> updateUser(@PathVariable("u_id")int id,@RequestBody User user){
		boolean isUserExist=userService.isUserExist(id);
		if(isUserExist) {
			user.setU_id(id);
			userService.updateUser(user);
			return new ResponseEntity<>("User is updated successfully",HttpStatus.OK);
		}else {
			throw new UserNotFoundException();
		}
	}
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public ResponseEntity<Object> getUser(){
		List<User> userList=userService.getUser();
		return new ResponseEntity<>(userList, HttpStatus.OK);
	}
	
	@RequestMapping(value="/user/{u_id}", method=RequestMethod.DELETE)//<--
	public ResponseEntity<Object> deleteUser(@PathVariable("u_id")int id){
		boolean isUserExist=userService.isUserExist(id);
		if(isUserExist) {
			userService.deleteUser(id);
			return new ResponseEntity<>("User is deleted successfully",HttpStatus.OK);
		}else {
			throw new UserNotFoundException();
		}
	}
}
