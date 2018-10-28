package com.sid.dao;

import java.util.List;

import com.sid.model.User;

public interface UserDao {
	
	public List<User> getAll();
	public String adduser(User user);

}
