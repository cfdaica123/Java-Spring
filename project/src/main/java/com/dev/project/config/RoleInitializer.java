package com.dev.project.config;

import com.dev.project.entity.Role;
import com.dev.project.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class RoleInitializer {

    @Autowired
    private RoleRepository roleRepository;

    private static boolean rolesInitialized = false;

    @PostConstruct
    public void init() {
        if (!rolesInitialized) {
            createRoleIfNotFound("ADMIN");
            createRoleIfNotFound("USER");
            rolesInitialized = true;
        }
    }

    private void createRoleIfNotFound(String roleName) {
        Role role = roleRepository.findByRoleName(roleName);
        if (role == null) {
            role = new Role(roleName);
            roleRepository.save(role);
        }
    }
}
