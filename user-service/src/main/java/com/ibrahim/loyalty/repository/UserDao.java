package com.ibrahim.loyalty.repository;

import com.ibrahim.loyalty.user.User;

public interface UserDao {

	User findById(long userId);

}
