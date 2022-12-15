package com.spring.C13S1PC.service;

import com.spring.C13S1PC.domain.Product;
import com.spring.C13S1PC.domain.User;
import com.spring.C13S1PC.exception.ProductAlreadyExistException;
import com.spring.C13S1PC.exception.ProductNotFoundException;
import com.spring.C13S1PC.exception.UserAlreadyExistException;
import com.spring.C13S1PC.exception.UserNotFoundException;

import java.util.List;

public interface IUserService {

    User registerUser (User user) throws UserAlreadyExistException;
    List<User> getAllUsers();
    String deleteByUserId(String email) throws UserNotFoundException;



}
