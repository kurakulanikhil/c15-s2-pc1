package com.spring.C13S1PC.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.CONFLICT,reason = "User already exist" )
public class UserAlreadyExistException extends Exception{
}
