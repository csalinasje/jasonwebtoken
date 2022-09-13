package com.security.jasonwebtoken.service;

import com.security.jasonwebtoken.entity.UserJWT;
import com.security.jasonwebtoken.repository.UserJWTRepository;
import org.springframework.stereotype.Service;

@Service
public class UserJWTService {

    private final UserJWTRepository repository;

    public UserJWTService(UserJWTRepository usersJWTRepository){
        this.repository = usersJWTRepository;
    }

    public UserJWT createUser(UserJWT user) {
        return this.repository.save(user);
    }
}
