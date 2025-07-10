package com.backend.Service;

import com.backend.Entity.UserEntity;
import com.backend.Repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    UserRepository userRepository;

    // create user
    public UserEntity createUser(UserEntity userEntity) {
        UserEntity user = userRepository.save(userEntity);

        return user;
    }

    // get all users
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    // get user by id
    public UserEntity getUserById(ObjectId id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    // update user by id
    public UserEntity updateUserById(ObjectId id, UserEntity userEntity) {
        UserEntity user = getUserById(id);
        user.setUserName(userEntity.getUserName());
        user.setPassword(userEntity.getPassword());
        user.setRole(userEntity.getRole());
        return userRepository.save(user);
    }

    // delete user by id
    public UserEntity deleteUserById(ObjectId id) {
        UserEntity user = getUserById(id);
        userRepository.delete(user);
        return user;
    }
}
