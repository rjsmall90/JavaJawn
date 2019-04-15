package com.javajawn.JavaJawn.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "admin")
public class Admin extends User {


    @GeneratedValue(strategy = GenerationType.AUTO)
    Long adminId;

    @OneToMany
    List<Employee> employeeId;
    String password;


    public Long getAdminId() {
        return adminId;
    }
    @Override
    void setId() {
       this.getAdminId();
    }

    public String getPassword() {
        return password;
    }
    @Override
    void setPassword() {
        this.getPassword();
    }

    public List<Employee> getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(List<Employee> employeeId) {
        this.employeeId = employeeId;
    }


}
