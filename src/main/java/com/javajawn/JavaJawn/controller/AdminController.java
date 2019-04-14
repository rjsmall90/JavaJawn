package com.javajawn.JavaJawn.controller;

import com.javajawn.JavaJawn.model.Admin;
import com.javajawn.JavaJawn.service.AdminService;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping(value = "/register")
    public ResponseEntity<Admin> registerUser(@RequestBody Admin newAdmin) {
        HttpStatus status = HttpStatus.CONFLICT;
        if (adminService.find(newAdmin) == null) {
            newAdmin = adminService.save(newAdmin);
            status = HttpStatus.CREATED;
        }

        return new ResponseEntity<>(newAdmin, new HttpHeaders(), status);
    }
}
