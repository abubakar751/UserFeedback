package com.user_feedback.repository;

import com.user_feedback.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends CrudRepository <User,Integer> {
 public User  findByUserName(String userName);

}
