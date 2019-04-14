package com.javajawn.JavaJawn.service;


import com.javajawn.JavaJawn.model.Employee;
import com.javajawn.JavaJawn.model.User;
import com.javajawn.JavaJawn.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    UserRepo employeeRepo;

    public Employee save(Employee employee) { return employeeRepo.saveAndFlush(employee); }

    public User find(Employee employee) { return employeeRepo.findById(employee.getEmployeeId()).get(); }

    public List<User> findAll() { return employeeRepo.findAll(); }

    public Employee update(Employee employee) { return employeeRepo.save(employee); }
}
