package com.web.Learning.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public  User createUser(User user){
        return userRepository.save(user);
    }


}
