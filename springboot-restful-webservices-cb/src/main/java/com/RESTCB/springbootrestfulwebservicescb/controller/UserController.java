package com.RESTCB.springbootrestfulwebservicescb.controller;

import com.RESTCB.springbootrestfulwebservicescb.model.User;
import com.RESTCB.springbootrestfulwebservicescb.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@AllArgsConstructor
@RequestMapping("users/api")
public class UserController {
    @Autowired
    private UserService userService;

    //Build create user REST API
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser=userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    //Build get user by ID REST API
    //http://localhost:8080/users/api/id
    @GetMapping("{id}")
    public ResponseEntity<User> getUserByID(@PathVariable("id") String userId){
        User getUserById=userService.getUserByID(userId);
        return new ResponseEntity<>(getUserById, HttpStatus.OK);
    }

    //Build get All user REST API
    //http://localhost:8080/users/api
    @GetMapping
    public ResponseEntity<List<User>> getAllUser(User user){
        List<User> getAllUser=userService.getAllUser(user);
        return new ResponseEntity<>(getAllUser,HttpStatus.OK);
    }
    //Build update user REST API
    //http://localhost:8080/users/api/id
    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") String userId,
                                           @RequestBody User user){
        user.setId(userId);
        User updatedUser=userService.updateUser(user);
        return new ResponseEntity<>(updatedUser,HttpStatus.OK);
    }
    //Build delete user REST API
    //http://localhost:8080/users/api/id
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") String userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User deleted successfully!",HttpStatus.OK);
    }

}
