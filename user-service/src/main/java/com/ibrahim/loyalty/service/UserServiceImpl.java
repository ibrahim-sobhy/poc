package com.ibrahim.loyalty.service;

import com.ibrahim.loyalty.repository.UserDao;
import com.ibrahim.loyalty.user.User;
/**
 * Manage user requests.
 * @author Ibrahim
 *
 */
public class UserServiceImpl implements UserService {
	/**
	 * Get user.
	 * @param userId of the target user.
	 * @return the searched user.
	 */
	public User getUser(final long userId) {
		return userDao.findById(userId);
	}
	/**
	 * Set user DAO dependency.
	 * @param dao dependency.
	 */
	public void setUserDao(final UserDao dao) {
		this.userDao = dao;
	}
	/**
	 * User DAO dependency.
	 */
	private UserDao userDao;
}
