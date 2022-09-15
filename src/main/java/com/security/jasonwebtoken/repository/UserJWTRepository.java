package com.security.jasonwebtoken.repository;

import com.security.jasonwebtoken.entity.Userjwt;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserJWTRepository extends PagingAndSortingRepository<Userjwt, Long> {
}
