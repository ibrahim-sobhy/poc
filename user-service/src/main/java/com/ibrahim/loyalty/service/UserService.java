package com.ibrahim.loyalty.service;

import com.ibrahim.loyalty.user.User;
/**
 * User service to handle user requests.
 * @author Ibrahim
 *
 */
public interface UserService {
	/**
	 * Get user.
	 * @param userId of the user.
	 * @return the target user.
	 */
	User getUser(long userId);
}
