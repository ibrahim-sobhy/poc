package com.ibrahim.loyalty.service;

import com.ibrahim.loyalty.repository.UserDao;
import com.ibrahim.loyalty.user.User;

public class UserServiceImpl implements UserService {

	public User getUser(long userId) {
		return userDao.findById(userId);
	}
	
	
	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	private UserDao userDao;
	
}
