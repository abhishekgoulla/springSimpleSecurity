package com.example.sprintRestExample.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.sprintRestExample.dao.UserRepository;
import com.example.sprintRestExample.entity.MyUserDetails;
import com.example.sprintRestExample.entity.User;

import java.util.List;
import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> userOptional = userRepository.findByUserName(userName);
        if(userOptional.isEmpty()) {
        	throw  new UsernameNotFoundException("Not found: " + userName);
        }
        User user=userOptional.get();
        MyUserDetails myUserDetails=new MyUserDetails(user);
        return myUserDetails;
    }
}
