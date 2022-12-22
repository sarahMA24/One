package com.kfh.training.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kfh.training.entities.Admin;
import com.kfh.training.exception.AdminNotFoundException;
import com.kfh.training.services.AdminService;



public class AdminServiceController {
private AdminService adminService;
	
	@RequestMapping(value="/admin",method=RequestMethod.POST)
	public ResponseEntity<Object> creatAdmin(@RequestBody Admin admin){
		admin=adminService.creatAdmin(admin);
		return new ResponseEntity<>("Admin is created successfully with id="+admin.getA_id(),HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/admin/{a_id}", method=RequestMethod.PUT)
	public ResponseEntity<Object> updateAdmin(@PathVariable("a_id")int id,@RequestBody Admin admin){
		boolean isAdminExist=adminService.isAdminExist(id);
		if(isAdminExist) {
			admin.setA_id(id);
			adminService.updateAdmin(admin);
			return new ResponseEntity<>("Admin is updated successfully",HttpStatus.OK);
		}else {
			throw new AdminNotFoundException();
		}
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public ResponseEntity<Object> getAdmin(){
		List<Admin> adminList=adminService.getAdmin();
		return new ResponseEntity<>(adminList, HttpStatus.OK);
	}
	
	@RequestMapping(value="/admin/{c_id}", method=RequestMethod.DELETE)//<--
	public ResponseEntity<Object> deleteAdmin(@PathVariable("a_id")int id){
		boolean isAdminExist=adminService.isAdminExist(id);
		if(isAdminExist) {
			adminService.deleteAdmin(id);
			return new ResponseEntity<>("Admin is deleted successfully",HttpStatus.OK);
		}else {
			throw new AdminNotFoundException();
		}
	}
}
