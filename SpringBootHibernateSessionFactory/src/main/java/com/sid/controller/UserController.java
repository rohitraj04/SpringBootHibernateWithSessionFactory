package com.sid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sid.model.AllDetails;
import com.sid.model.User;
import com.sid.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/users", method = RequestMethod.GET)
	public ResponseEntity<List<User>> allUser(){
		return new ResponseEntity<List<User>>(userService.getAll(), HttpStatus.OK);
	}
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public ResponseEntity<String> addUser(@RequestBody AllDetails user){
		System.out.println(user.getUserName());
		return new ResponseEntity<String>(userService.adduser(user), HttpStatus.CREATED);
	}

}
