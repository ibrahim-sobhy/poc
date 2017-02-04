package com.ibrahim.loyalty;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibrahim.loyalty.repository.UserDao;
import com.ibrahim.loyalty.service.UserService;
import com.ibrahim.loyalty.service.UserServiceImpl;
import com.ibrahim.loyalty.user.User;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceApplicationTests {
	
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
		
		//Execure the method being tested
		User actualUser = userService.getUser(userId);
		
		//Validations
		assertNotNull(actualUser);
		assertEquals(userId, actualUser.getId());
		assertEquals(userName, actualUser.getName());
		
		//Verifications
		verify(userDao).findById(userId);
	}
	
	

}
