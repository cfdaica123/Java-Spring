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
public class SuperAdminInitializer implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;

    @Autowired
    public SuperAdminInitializer(EmployeeRepository employeeRepository, RoleRepository roleRepository,
                                 UserRepository userRepository) {
        this.employeeRepository = employeeRepository;
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        // Kiểm tra xem đã có role ADMIN chưa
        Role adminRole = roleRepository.findByRoleName("ADMIN");
        if (adminRole == null) {
            // Nếu chưa có, tạo mới
            adminRole = new Role("ADMIN");
            roleRepository.save(adminRole);
        }

        // Kiểm tra xem đã có user super admin chưa
        User superAdminUser = userRepository.findByUsername("super_admin");
        if (superAdminUser == null) {
            // Nếu chưa có, tạo mới
            Employee superAdminEmployee = new Employee();
            superAdminEmployee.setFirstName("Super");
            superAdminEmployee.setLastName("Admin");
            employeeRepository.save(superAdminEmployee);

            superAdminUser = new User();
            superAdminUser.setEmployee(superAdminEmployee);
            superAdminUser.setUsername("super_admin");
            superAdminUser.setRoles(Arrays.asList(adminRole));
            userRepository.save(superAdminUser);
        }
    }
}
