package com.example.sqlSpring;

import org.springframework.data.repository.CrudRepository;
import com.example.sqlSpring.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}