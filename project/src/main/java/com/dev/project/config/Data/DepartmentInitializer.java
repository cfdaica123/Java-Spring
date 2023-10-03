package com.dev.project.config.Data;

import com.dev.project.entity.Department;
import com.dev.project.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class DepartmentInitializer implements CommandLineRunner {

    @Autowired
    private DepartmentRepository departmentRepository;

    // Sử dụng AtomicBoolean thay vì static boolean
    private final AtomicBoolean departmentsInitialized = new AtomicBoolean(false);

    @Override
    public void run(String... args) throws Exception {

        // Tạo phòng ban nếu chưa được khởi tạo
        if (departmentsInitialized.compareAndSet(false, true)) {
            initializeDepartments();
        }
    }

    private void initializeDepartments() {
        createDepartmentIfNotExists("Development", "Responsible for software development");
        createDepartmentIfNotExists("Testing", "Responsible for quality assurance and testing");
        createDepartmentIfNotExists("Project Management", "Responsible for project management and coordination");
        createDepartmentIfNotExists("UI/UX Design", "Responsible for user interface and user experience design");
        createDepartmentIfNotExists("Customer Support", "Provides technical support and assistance to users");
        createDepartmentIfNotExists("Business Development", "Focuses on business growth and customer relationships");
        createDepartmentIfNotExists("Marketing", "Handles product advertising and marketing");
        createDepartmentIfNotExists("Research and Development", "Focuses on researching and developing new technologies");
        createDepartmentIfNotExists("Finance", "Manages financial matters of the company");
        createDepartmentIfNotExists("Human Resources", "Manages personnel, recruitment, and HR-related issues");
    }

    private void createDepartmentIfNotExists(String departmentName, String description) {
        Department existingDepartment = departmentRepository.findByDepartmentName(departmentName);

        if (existingDepartment == null) {
            Department department = new Department();
            department.setDepartmentName(departmentName);
            department.setDescription(description);
            departmentRepository.save(department);
        }
    }
}
