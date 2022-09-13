package com.security.jasonwebtoken.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserJWTDTO {
    private long id;
    private String username;
    private String password;
    private List<RolesDTO> rolesDTOS;
    private Boolean isActive;
}
