package com.security.jasonwebtoken.repository;

import com.security.jasonwebtoken.entity.UserJWT;
import org.springframework.data.repository.CrudRepository;

public interface UserJWTRepository extends CrudRepository<UserJWT, Long> {
}
