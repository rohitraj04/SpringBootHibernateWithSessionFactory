package com.sid.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sid.dao.UserDao;
import com.sid.model.User;
@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<User> getAll() {
		List<User> allUsers = (List<User>)getSession().createQuery("FROM USER_DETAILS").list();
		List<User> users = new ArrayList<User>();
		for(User u : allUsers){
			users.add(u);
		}
		return users;
	}

	@Override
	public String adduser(User user) {
		getSession().save(user);
		return "Added";
	}

}
