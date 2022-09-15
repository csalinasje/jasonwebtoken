package com.security.jasonwebtoken.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.security.jasonwebtoken.enums.RolEnum;
import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name="usersjwt")
@Data
@NoArgsConstructor
public class Userjwt implements Serializable {
    @Serial
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String username;
    @Column
    @JsonIgnore
    private String password;

    @Column
    private Boolean isActive;

    @Column
    @NonNull
    private RolEnum rol;
}
