package com.dev.project.config;

import com.dev.project.entity.Employee;
import com.dev.project.entity.Role;
import com.dev.project.entity.User;
import com.dev.project.repository.EmployeeRepository;
import com.dev.project.repository.RoleRepository;
import com.dev.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        // Kiểm tra xem đã có user với username "cp_son" chưa
        User existingUser = userRepository.findByUsername("cp_son").orElse(null);

        if (existingUser == null) {
            // Nếu chưa có, tạo mới user
            // Create roles
            Role adminRole = new Role();
            adminRole.setRoleName("ADMIN");
            roleRepository.save(adminRole);

            // Create employee
            Employee adminEmployee = new Employee();
            adminEmployee.setFirstName("Cao");
            adminEmployee.setLastName("Phước Sơn");
            employeeRepository.save(adminEmployee);

            // Create user
            User adminUser = new User();
            adminUser.setUsername("cp_son");
            adminUser.setPassword(passwordEncoder.encode("admin"));
            adminUser.setEmployee(adminEmployee);
            adminUser.setRoles(Arrays.asList(adminRole));
            userRepository.save(adminUser);
        }
    }
}
