package com.dev.project.config.Data;

import com.dev.project.entity.Project;
import com.dev.project.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProjectInitializer implements CommandLineRunner {

    @Autowired
    private ProjectRepository projectRepository;

    // Thêm khai báo biến projectsInitialized ở đây
    private static boolean projectsInitialized = false;

    @Override
    public void run(String... args) throws Exception {

        // Tạo dự án nếu chưa được khởi tạo
        if (!projectsInitialized) {
            initializeProjects();
            projectsInitialized = true;
        }
    }

    private void initializeProjects() {
        createProjectIfNotExists("Project A");
        createProjectIfNotExists("Project B");
        createProjectIfNotExists("Project C");
    }

    private void createProjectIfNotExists(String projectName) {
        Project existingProject = projectRepository.findByProjectName(projectName);

        if (existingProject == null) {
            Project project = new Project();
            project.setProjectName(projectName);
            projectRepository.save(project);
        }
    }
}
