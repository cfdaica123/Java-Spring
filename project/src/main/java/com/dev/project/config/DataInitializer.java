package com.dev.project.config;

import com.dev.project.entity.Employee;
import com.dev.project.entity.Role;
import com.dev.project.entity.User;
import com.dev.project.repository.EmployeeRepository;
import com.dev.project.repository.RoleRepository;
import com.dev.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;

    @Autowired
    public DataInitializer(EmployeeRepository employeeRepository, RoleRepository roleRepository,
                           UserRepository userRepository) {
        this.employeeRepository = employeeRepository;
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        // Your initialization logic without using PasswordEncoder
    }
}
