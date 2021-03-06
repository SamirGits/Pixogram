package com.cts.training.userservice.service;

import java.util.List;
import java.util.Optional;

import com.cts.training.userservice.entity.Users;
import com.cts.training.userservice.model.UserInput;
import com.cts.training.userservice.model.UserOutput;






public interface IUserService {

	public List<Users> findAllUsers();
	public Optional<Users> findUserById(Integer id);
	public void addUser(UserInput  userInput);
	public void  updateUser(UserOutput  action);
	
	
	
	
	
	
}
