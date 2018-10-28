package com.sid.daoImpl;

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
		return getSession().createQuery("from user").list();
	}

	@Override
	public String adduser(User user) {
		getSession().save(user);
		return "Added";
	}

}
