package com.web.Learning.user;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @Column(name = "OID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;

    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "email",nullable = false)
    private String email;
}
