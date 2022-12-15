package com.spring.C13S1PC.controller;

import com.spring.C13S1PC.domain.Product;
import com.spring.C13S1PC.domain.User;

import com.spring.C13S1PC.exception.UserAlreadyExistException;
import com.spring.C13S1PC.exception.UserNotFoundException;

import com.spring.C13S1PC.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class UserController {
    private IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<?> getAllUser(){
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);

    }

    @PostMapping("/registerUser")
    public ResponseEntity<?> registerUser(@RequestBody User user) throws UserAlreadyExistException{
        return new ResponseEntity<>(userService.registerUser(user),HttpStatus.CREATED);
    }

    @DeleteMapping("/users/{email}")
    public ResponseEntity<?> deleteUser(@PathVariable String email) throws UserNotFoundException{
        return new ResponseEntity<>(userService.deleteByUserId(email),HttpStatus.OK);
    }



//    @DeleteMapping("/products/{productId}")
//    public ResponseEntity<?> deleteProduct(@PathVariable int productId) throws ProductNotFoundException {
//        return new ResponseEntity<>(productService.deleteProductByProductId(productId),HttpStatus.OK);
//    }



}
