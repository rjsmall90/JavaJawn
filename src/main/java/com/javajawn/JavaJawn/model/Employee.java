package com.javajawn.JavaJawn.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee extends User {

    String username;

    public Employee(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
