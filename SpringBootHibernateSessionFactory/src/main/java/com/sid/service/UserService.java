package com.sid.service;

import java.util.List;

import com.sid.model.User;

public interface UserService {
	public List<User> getAll();
	public String adduser(User user);

}
