package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.dao.UserRepository;
import com.smart.entities.User;

@Controller
public class HomeController 
{
	
	/*
	 * @Autowired UserRepository repository;
	 */
	 
	@GetMapping("/test")
	@ResponseBody
	public String test()
	{
		
		User user= new User();
		user.setName("vikram");
		user.setEmail("vikram@email.com");
		//repository.save(user);
		return "working";
		
	}
	

}
