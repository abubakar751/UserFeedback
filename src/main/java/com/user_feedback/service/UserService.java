package com.user_feedback.service;

import com.user_feedback.entity.User;
import com.user_feedback.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public User getByUsername(String username){
        return  userRepo.findByUserName(username);
    }
   public User register(User user){
        return userRepo.save(user);
   }
}
