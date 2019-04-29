package com.javajawn.JavaJawn.service;


import com.javajawn.JavaJawn.model.Employee;
import com.javajawn.JavaJawn.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public Employee save(Employee employee) { return employeeRepo.saveAndFlush(employee); }

    public Employee find(Employee employee) { return employeeRepo.findById(employee.getId()).get(); }

    public List<Employee> findAll() { return employeeRepo.findAll(); }

    public Employee update(Employee employee) { return employeeRepo.save(employee); }

    public Employee findUsername(Employee employee) { return  employeeRepo.findByUsername(employee.getUsername()); }

}
