package com.ibrahim.loyalty.user;
/**
 * User entity.
 * @author ibrahim
 *
 */
public class User {
	/**
	 * Construct the user.
	 * @param userName of the user.
	 */
	public User(final String userName) {
		this.name = userName;
	}
	/**
	 * Get the user id.
	 * @return user id.
	 */
	public long getId() {
		return id;
	}
	/**
	 * Set user id.
	 * @param userId of the user.
	 */
	public void setId(final long userId) {
		this.id = userId;
	}
	/**
	 * Get user name.
	 * @return user name.
	 */
	public String getName() {
		return name;
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
