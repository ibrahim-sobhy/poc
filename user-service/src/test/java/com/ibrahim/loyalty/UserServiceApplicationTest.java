package com.ibrahim.loyalty;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.ibrahim.loyalty.repository.UserDao;
import com.ibrahim.loyalty.service.UserServiceImpl;
import com.ibrahim.loyalty.user.User;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceApplicationTest {
	
	@Mock
	private UserDao userDao;
	
	@InjectMocks
	private UserServiceImpl userService = new UserServiceImpl();
	
	
	@Test
	public void getUserDetails() {
		long userId = 1234;
		String userName = "user1";
		User userToGet = new User(userName);
		userToGet.setId(userId);
		
		//Mockito Expectaions
		when(userDao.findById(userId)).thenReturn(userToGet);
		
		//Execute the method being tested
		User actualUser = userService.getUser(userId);
		
		//Validations
		assertNotNull(actualUser);
		assertEquals(userId, actualUser.getId());
		assertEquals(userName, actualUser.getName());
		
		//Verifications
		verify(userDao).findById(userId);
	}
}
