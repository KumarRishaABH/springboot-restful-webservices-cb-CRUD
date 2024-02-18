package com.RESTCB.springbootrestfulwebservicescb.service;

import com.RESTCB.springbootrestfulwebservicescb.model.User;
import com.RESTCB.springbootrestfulwebservicescb.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserByID(String userId) {
        Optional<User> optionalUser=userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUser(User user) {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User existingUser=userRepository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        User updatedUser=userRepository.save(existingUser);
        return updatedUser;
    }

    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}
