package com.security.jasonwebtoken.service;

import com.security.jasonwebtoken.entity.Userjwt;
import com.security.jasonwebtoken.repository.UserJWTRepository;
import org.springframework.stereotype.Service;

@Service
public class UserJWTService {

    private final UserJWTRepository repository;

    public UserJWTService(UserJWTRepository usersJWTRepository){
        this.repository = usersJWTRepository;
    }

    public Userjwt createUser(Userjwt user) {
        return this.repository.save(user);
    }
}
