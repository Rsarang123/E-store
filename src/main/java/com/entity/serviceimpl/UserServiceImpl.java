package com.entity.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.model.User;
import com.entity.repository.UserRepository;
import com.entity.service.UserService;
@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepository usr;
	@Override
	public User loginUser(String username, String password) {
		User u=usr.findByUsernameAndPassword(username,password);
		return u;
	}

	@Override
	public User saveUser(User user) {
	return	usr.save(user);
	
	}

	@Override
	public List<User> getAllUser() {
		List<User> all = usr.findAll();
		return all;
	}

	@Override
	public List<User> getListByCity(String cityname) {
		List<User> byCity = usr.findByCity(cityname);
		return byCity;
	}

	@Override
	public User getUserByUserName(String username) {
		User u1=usr.findByUsername(username);
		return u1;
	}
	
	

}
