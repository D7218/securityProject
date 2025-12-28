package com.PracticeThink.service;

import com.PracticeThink.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService{

    // create fake data
    List<User> list = new ArrayList<>();

    public UserService(){
        list.add(new User("satish","abc","satish@gmail.com"));
        list.add(new User("mohan","skd","mohan@gmail.com"));
    }
    // get all usrs
    public List<User> getAllUsers(){
        return this.list;
    }

    // get single user
    public User getUser(String userName){
        return this.list.stream()
                .filter((user) -> user.getUserName()
                        .equals(userName)).findAny()
                            .orElse(null);
    }
    // add new user
    public User addUser(User user){
        this.list.add(user);
        return user;
    }
    // nothing to create

	
}
