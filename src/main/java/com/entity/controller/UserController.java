package com.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.entity.model.User;
import com.entity.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UserController {
	@Autowired
	UserService US;
  @GetMapping("/loginUser/{userName}/{password}")
  public User getMethodName(@PathVariable String userName ,@PathVariable String password) {
      User loginUser = US.loginUser(userName, password);
      System.out.println("Done");
      return loginUser;
      
  }
  @PostMapping("/save")
  public User postMethodName(@RequestBody User user) {
  User user1= US.saveUser(user);
      
      return user1;
  }
  @GetMapping("/getAllUser")
  public List<User> getMethodName() {
	  List<User> list5=US.getAllUser();
	  return list5;
  }
  
  @GetMapping("/city/{cityname}")
  public  List<User>  getMethodName(@PathVariable String cityname) {
	  List<User> listByCity = US.getListByCity(cityname);
      return listByCity;
  }
  
  @GetMapping("/User/{Username}")
  public User getUserByUserName(@PathVariable String Username) {
	 User u1 =  US.getUserByUserName(Username);
	  return u1;
      
  }
  
  
  
}
