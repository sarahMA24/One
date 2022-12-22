package com.kfh.training.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfh.training.dao.AdminRepository;
import com.kfh.training.entities.Admin;
import com.kfh.training.services.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin creatAdmin(Admin admin) {return  adminRepository.save(admin);}

	@Override
	public void updateAdmin(Admin admin) {adminRepository.save(admin);}

	@Override
	public Admin getAdmin(int id) {
		Optional <Admin> optional=adminRepository.findById(id);
		Admin admin=optional.get();
		return admin;
	}

	@Override
	public List<Admin> getAdmin() {return (List<Admin>)adminRepository.findAll();}

	@Override
	public void deleteAdmin(int id) {adminRepository.deleteById(id);}

	@Override
	public boolean isAdminExist(int id) {return adminRepository.existsById(id);}

	

}


