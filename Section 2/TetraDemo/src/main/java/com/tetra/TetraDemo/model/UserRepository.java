package com.tetra.TetraDemo.model;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
	public User findUserById(int id);
}
