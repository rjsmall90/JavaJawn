package com.javajawn.JavaJawn.service;


import com.javajawn.JavaJawn.model.Admin;
import com.javajawn.JavaJawn.model.User;
import com.javajawn.JavaJawn.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    UserRepo adminRepo;

    public Admin save(Admin admin) { return adminRepo.saveAndFlush(admin); }

    public User find(Admin admin) { return adminRepo.findById(admin.getAdminId()).get(); }

    public List<User> findAll() { return adminRepo.findAll(); }

    public Admin update(Admin admin) { return adminRepo.save(admin); }


}
