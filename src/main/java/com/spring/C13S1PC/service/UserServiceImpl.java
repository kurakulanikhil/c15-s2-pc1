package com.spring.C13S1PC.service;

import com.spring.C13S1PC.domain.Product;
import com.spring.C13S1PC.domain.User;
import com.spring.C13S1PC.exception.UserAlreadyExistException;
import com.spring.C13S1PC.exception.UserNotFoundException;
import com.spring.C13S1PC.proxy.UserProxy;
import com.spring.C13S1PC.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    private UserRepository userRepository;

    private UserProxy userProxy;



    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserProxy userProxy) {
        this.userRepository = userRepository;
        this.userProxy = userProxy;
    }

    @Override
    public User registerUser(User user) throws UserAlreadyExistException {
        if(userRepository.findById(user.getEmail()).isPresent()){
            throw new UserAlreadyExistException();
        }
        userProxy.saveUser(user);

        return userRepository.save(user);


    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();


    }

    @Override
    public String deleteByUserId(String email) throws UserNotFoundException {
        if(userRepository.findById(email).isEmpty()){
            return "user does not exist";
        }else {
            userRepository.deleteById(email);
            return "user deleted succesfully";
        }

//        if (productRepository.findById(productId).isEmpty()) {
//            return "product does not exist";
//        } else {
//            productRepository.deleteById(productId);
//            return "product deleted succesfully";
//        }
    }



}
