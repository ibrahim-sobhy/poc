package com.ibrahim.loyalty.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ibrahim.loyalty.user.User;

/**
 * Repository for user operations.
 * 
 * @author Ibrahim
 *
 */
@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {
}
