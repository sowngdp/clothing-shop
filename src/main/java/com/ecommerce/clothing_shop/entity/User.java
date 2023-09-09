package com.ecommerce.clothing_shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@Entity
@Table
public class User {
    @Id
    private String id = UUID.randomUUID().toString();
    @Column(unique = true,length = 50,nullable = false)
    private String username;
    @Column(length = 50,nullable = false)
    private String password;
    @Column(length = 100,unique = true,nullable = false)
    private String email;
    @Column(length = 50,nullable = false)
    private String firstName;
    @Column(length = 50,nullable = false)
    private String lastName;

}
