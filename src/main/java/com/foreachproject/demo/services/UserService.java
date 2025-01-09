package com.foreachproject.demo.services;

import com.foreachproject.demo.models.User;
import com.foreachproject.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> findAll(){
        Iterable<User> users = userRepository.findAll();
        return users;
    }

    public User find(int id){
        return userRepository.findById(id).get();
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public void delete(int id){
        userRepository.deleteById(id);
    }

    public User findByEmail(String mail){
        return userRepository.findByEmail(mail);
    }
}
