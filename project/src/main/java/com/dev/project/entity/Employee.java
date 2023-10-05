package com.dev.project.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String firstName;

    private String lastName;

    private Date birthdate;

    private Date hireDate;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @OneToOne(mappedBy = "employee")
    private User user;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "office_id")
    private Office office;

    @ManyToMany(mappedBy = "members")
    private List<Team> teams;

    @OneToMany(mappedBy = "employee")
    private List<Salary> salaries;

    @OneToMany(mappedBy = "employee")
    private List<Training> trainings;

    @ManyToMany
    @JoinTable(
            name = "employee_languages",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id")
    )
    private List<Language> languages;

    @OneToMany(mappedBy = "employee")
    private List<LeaveRequest> leaveRequests;

    @ManyToOne
    @JoinColumn(name = "nationality_id")
    private Nationality nationality;

    @OneToMany(mappedBy = "employee")
    private List<Skill> skills;

    @OneToMany(mappedBy = "employee")
    private List<EmploymentContract> employmentContracts;

    @OneToOne(mappedBy = "employee")
    private Lecturer lecturer;

    @OneToOne(mappedBy = "employee")
    private Student student;

    // Getters and setters

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    public List<Training> getTrainings() {
        return trainings;
    }

    public void setTrainings(List<Training> trainings) {
        this.trainings = trainings;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public List<LeaveRequest> getLeaveRequests() {
        return leaveRequests;
    }

    public void setLeaveRequests(List<LeaveRequest> leaveRequests) {
        this.leaveRequests = leaveRequests;
    }

    public Nationality getNationality() {
        return nationality;
    }
    
    public void setNationality(Nationality nationality) {
        // Kiểm tra null nếu cần thiết
        if (nationality != null) {
            this.nationality = nationality;
        } else {
            // Xử lý trường hợp giá trị null không được chấp nhận
            // Ví dụ: có thể throw một IllegalArgumentException
            throw new IllegalArgumentException("Nationality cannot be null");
        }
    }
    
    
    

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<EmploymentContract> getEmploymentContracts() {
        return employmentContracts;
    }

    public void setEmploymentContracts(List<EmploymentContract> employmentContracts) {
        this.employmentContracts = employmentContracts;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "user=" + user +
                ", department=" + department +
                ", office=" + office +
                ", teams=" + teams +
                ", salaries=" + salaries +
                ", trainings=" + trainings +
                ", languages=" + languages +
                ", leaveRequests=" + leaveRequests +
                ", nationality=" + nationality +
                ", skills=" + skills +
                ", employmentContracts=" + employmentContracts +
                ", lecturer=" + lecturer +
                ", student=" + student +
                "}";
    }
}
