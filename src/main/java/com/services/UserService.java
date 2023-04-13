package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.users;
import com.repository.UserRepository;

@Service
public class UserService{
    
    @Autowired
    private UserRepository userRepository;
    
    public users createUser(users user) throws Exception {
        // Check if username is unique
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new Exception("Username already exists");
        }
        
        // Set default rating
        user.setRating(1200);
        
        return userRepository.save(user);
    }
    
    public users getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }
    
    public users getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
    public void updateUser(users user) {
        userRepository.save(user);
    }

    public void register(users user) {
    }

    public boolean authenticate(users user) {
        return false;
    }
}
    

