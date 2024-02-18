package com.RESTCB.springbootrestfulwebservicescb.service;

import com.RESTCB.springbootrestfulwebservicescb.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserByID(String userId);
    List<User> getAllUser(User user);
    User updateUser(User user);
    void deleteUser(String userId);
}
