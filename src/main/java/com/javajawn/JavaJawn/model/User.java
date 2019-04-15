package com.javajawn.JavaJawn.model;

import javax.persistence.*;

@Entity
abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String password;

    public Long getId() {
        return id;
    }

    abstract void setId();


    public String getPassword() {
        return password;
    }

    abstract void setPassword();
}
