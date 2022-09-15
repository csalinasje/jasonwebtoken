package com.security.jasonwebtoken.dto;

import com.security.jasonwebtoken.enums.RolEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserJWTDTO {
    private long id;
    private String username;
    private String password;
    private RolEnum rol;
    private Boolean isActive;
}
