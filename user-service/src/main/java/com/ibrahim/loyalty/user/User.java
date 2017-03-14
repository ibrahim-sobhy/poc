package com.ibrahim.loyalty.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * User entity.
 * 
 * @author ibrahim
 *
 */
@Entity
public class User {	
	/**
	 * Get the user id.
	 * 
	 * @return user id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	/**
	 * Set user id.
	 * 
	 * @param userId
	 *            of the user.
	 */
	public void setId(final long userId) {
		this.id = userId;
	}

	/**
	 * Get user name.
	 * 
	 * @return user name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set user name.
	 * 
	 * @param userName
	 *            user name.
	 */
	public void setName(final String userName) {
		this.name = userName;
	}

	/**
	 * Id of the user.
	 */
	private long id;
	/**
	 * Name of the user.
	 */
	private String name;
}
