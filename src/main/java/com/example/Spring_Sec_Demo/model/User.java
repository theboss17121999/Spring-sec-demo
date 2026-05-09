package com.example.Spring_Sec_Demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="usersNew")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String  password;
}
