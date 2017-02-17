package com.ibrahim.loyalty.repository;

import com.ibrahim.loyalty.user.User;
/**
 * DAO for user operations.
 * @author Ibrahim
 *
 */
public interface UserDao {
	/**
	 * Find user by id.
	 * @param userId of the user.
	 * @return User.
	 */
	User findById(final long userId);
}
