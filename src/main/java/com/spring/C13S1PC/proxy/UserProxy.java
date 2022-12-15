package com.spring.C13S1PC.proxy;

import com.spring.C13S1PC.domain.User;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="user-auth",url = "localhost:8082")


public interface UserProxy {
    @PostMapping("/api/v1/register")
    public ResponseEntity<?> saveUser(@RequestBody User user);
}
