package com.sid.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.dao.UserDao;
import com.sid.model.User;
import com.sid.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

	@Override
	public String adduser(User user) {
		// TODO Auto-generated method stub
		return userDao.adduser(user);
	}

}
