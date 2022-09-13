package com.security.jasonwebtoken.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
@Data
@Entity
@Table(name = "roles")
public class Roles implements Serializable {
    @Serial
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @ManyToOne
    @JoinColumn(name = "usersjwt_id")
    private UserJWT usersJWT;

}
