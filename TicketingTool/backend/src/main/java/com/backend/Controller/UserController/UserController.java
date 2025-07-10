package com.backend.Controller.UserController;

import com.backend.Entity.UserEntity;
import com.backend.Service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    // Create user
    @PostMapping("create-user")
    public ResponseEntity<?> createUser(@RequestBody UserEntity userEntity) {
        return new ResponseEntity<>(userService.createUser(userEntity), HttpStatus.CREATED);
    }

    // Get all users
    @GetMapping("get-all")
    public ResponseEntity<?> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    // Get user by id
    @GetMapping("get-user/{id}")
    public ResponseEntity<?> getUserById(@PathVariable ObjectId id) {
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    // update user by id

    @PutMapping("update/{id}")
    public ResponseEntity<?> updateUserById(@PathVariable ObjectId id, @RequestBody UserEntity userEntity) {
        return new ResponseEntity<>(userService.updateUserById(id, userEntity), HttpStatus.OK);
    }

    // delete user by id

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable ObjectId id) {
        return new ResponseEntity<>(userService.deleteUserById(id), HttpStatus.OK);
    }
}

