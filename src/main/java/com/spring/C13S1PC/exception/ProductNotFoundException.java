package com.spring.C13S1PC.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.CONFLICT,reason = "Product does not exist" )
public class ProductNotFoundException extends Exception {

}
