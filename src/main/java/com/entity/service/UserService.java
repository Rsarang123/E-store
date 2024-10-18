package com.entity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.model.User;

public interface UserService {
	public User loginUser(String username, String password);
	public User saveUser(User user);
	public List<User> getAllUser();
	public List<User> getListByCity(String cityname);
	public User getUserByUserName(String username);


}
