package com.javajawn.JavaJawn.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee extends User {


    @GeneratedValue(strategy = GenerationType.AUTO)
    Long employeeId;

    private String username;
    private String password;

//    @ManyToOne
//    List<?> schedule;

    public Long getEmployeeId() {
        return employeeId;
    }

    @Override
    void setId() {
        this.getEmployeeId();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    void setPassword() {
        this.getPassword();
    }

//    public List<?> getSchedule() {
//        return schedule;
//    }
//
//    public void setSchedule(List<?> schedule) {
//        this.schedule = schedule;
//    }
}
