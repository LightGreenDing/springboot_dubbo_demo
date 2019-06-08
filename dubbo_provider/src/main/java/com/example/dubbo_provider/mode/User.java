package com.example.dubbo_provider.mode;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = " username ")
    private String userName;
    @Column(name = " password ")
    private String password;
    @Column(name = " age ")
    private int age;
}
