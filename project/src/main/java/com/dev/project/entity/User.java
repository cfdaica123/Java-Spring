package com.dev.project.entity;

import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;

    private String password;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToMany
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;

    public User() {
        // Default constructor
    }

    public User(Employee employee, PasswordEncoder passwordEncoder) {
        this.employee = employee;
        generateUsername();
        generatePassword(passwordEncoder);
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void generateUsername() {
        if (employee != null) {
            String firstName = employee.getFirstName();
            String lastName = employee.getLastName();

            if (firstName != null && lastName != null) {
                // Lấy chữ cái đầu tiên của họ và tên
                String firstCharFirstName = firstName.substring(0, 1).toLowerCase();
                String firstCharLastName = lastName.substring(0, 1).toLowerCase();

                // Tạo username theo quy tắc
                username = firstCharFirstName + firstCharLastName + "_" + lastName.toLowerCase();
            }
        }
    }

    public void generatePassword(PasswordEncoder passwordEncoder) {
        // Ở đây bạn có thể tạo một mật khẩu ngẫu nhiên hoặc sử dụng quy tắc cụ thể
        // Ví dụ: password = "defaultPassword";
        password = passwordEncoder.encode("defaultPassword");
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", employee=" + employee +
                ", roles=" + roles +
                '}';
    }
}
