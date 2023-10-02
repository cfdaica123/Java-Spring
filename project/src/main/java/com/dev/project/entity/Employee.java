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

    @OneToMany(mappedBy = "employee")
    private List<Language> languages;

    @OneToMany(mappedBy = "employee")
    private List<LeaveRequest> leaveRequests;

    @OneToMany(mappedBy = "employee")
    private List<Nationality> nationalities;

    @OneToMany(mappedBy = "employee")
    private List<Skill> skills;

    @OneToMany(mappedBy = "employee")
    private List<EmploymentContract> employmentContracts;

    @OneToOne(mappedBy = "employee")
    private Lecturer lecturer;

    @OneToOne(mappedBy = "employee")
    private Student student;

    // Getter and setter for employeeId

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    // Getter and setter for firstName

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and setter for lastName

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and setter for birthdate

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    // Getter and setter for hireDate

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    // Getter and setter for position

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    // Getter and setter for department

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // Getter and setter for office

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    // Getter and setter for teams

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    // Getter and setter for salaries

    public List<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    // Getter and setter for trainings

    public List<Training> getTrainings() {
        return trainings;
    }

    public void setTrainings(List<Training> trainings) {
        this.trainings = trainings;
    }

    // Getter and setter for languages

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    // Getter and setter for leaveRequests

    public List<LeaveRequest> getLeaveRequests() {
        return leaveRequests;
    }

    public void setLeaveRequests(List<LeaveRequest> leaveRequests) {
        this.leaveRequests = leaveRequests;
    }

    // Getter and setter for nationalities

    public List<Nationality> getNationalities() {
        return nationalities;
    }

    public void setNationalities(List<Nationality> nationalities) {
        this.nationalities = nationalities;
    }

    // Getter and setter for skills

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    // Getter and setter for employmentContracts

    public List<EmploymentContract> getEmploymentContracts() {
        return employmentContracts;
    }

    public void setEmploymentContracts(List<EmploymentContract> employmentContracts) {
        this.employmentContracts = employmentContracts;
    }

    // Getter and setter for lecturer

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    // Getter and setter for student

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    // toString method

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate=" + birthdate +
                ", hireDate=" + hireDate +
                ", position=" + position +
                ", department=" + department +
                ", office=" + office +
                ", teams=" + teams +
                ", salaries=" + salaries +
                ", trainings=" + trainings +
                ", languages=" + languages +
                ", leaveRequests=" + leaveRequests +
                ", nationalities=" + nationalities +
                ", skills=" + skills +
                ", employmentContracts=" + employmentContracts +
                ", lecturer=" + lecturer +
                ", student=" + student +
                '}';
    }
}
