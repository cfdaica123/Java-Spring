package com.dev.project.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "project_name")
    private String projectName;

    @OneToMany(mappedBy = "project")
    private List<Team> teams;

    // Getters and setters
    public Long getProjectId() {
        return projectId;
    }
    
    // Setter for projectId
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
    
    // Getter for projectName
    public String getProjectName() {
        return projectName;
    }
    
    // Setter for projectName
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", teams=" + teams +
                '}';
    }
}
