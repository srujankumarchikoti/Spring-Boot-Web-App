package com.csk.springmongo.repository;

import com.csk.springmongo.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository for saving new and retrieving existing {@link User}s from MongoDB
 *
 * @author Srujan
 */
public interface UserRepository extends PagingAndSortingRepository<User, String> {
}
