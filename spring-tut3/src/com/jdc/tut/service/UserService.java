package com.jdc.tut.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jdc.tut.LibaryException;
import com.jdc.tut.entity.User;
import com.jdc.tut.repository.UserRepo;




@Service 
public class UserService {
	@Autowired
	private UserRepo repo;
	
	public User findBylogin(String  name,String pass) {
		
		if(StringUtils.isEmpty(name)) {
			throw new LibaryException("Please Type your login_id");
		}
		if(StringUtils.isEmpty(pass)) {
			throw new LibaryException("Please Type your passward");
		}
	User user =repo.findByLoginId(name);
	
	
	if (user==null) {
		throw new LibaryException("Please check your user name");
	}
	if(!user.getPassword().equals(pass)) {
		throw new LibaryException("Please check your user passward");

	}
   return repo.findByLoginId(name);
	}
	

}
