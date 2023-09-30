package com.example.ex.entitty;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name = "STUDENT")
public class Student {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	private String lastName;

    @Column(name = "FIRST_NAME")
    private String firstName;
    
    @Column(name = "BIRTH_DATE")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    
    @Column(name = "CURRENT_ADDRESS")
    private String currentAddress;
    
    @Column(name = "CCCD")
    private String cccd;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    
    @Column(name = "HOME_TOWN")
    private String homeTown;

    @ManyToMany
    @JoinTable(
        name = "STUDENT_COURSE",
        joinColumns = @JoinColumn(name = "STUDENT_ID"),
        inverseJoinColumns = @JoinColumn(name = "COURSE_ID"))
    private List<Course> courses;
    
    public Student() {
        
    }
    
    
    
    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public Date getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}



	public String getCurrentAddress() {
		return currentAddress;
	}



	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}



	public String getCccd() {
		return cccd;
	}



	public void setCccd(String cccd) {
		this.cccd = cccd;
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}



	public String getHomeTown() {
		return homeTown;
	}



	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}



	public List<Course> getCourses() {
		return courses;
	}



	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", birthDate=" + birthDate
				+ ", currentAddress=" + currentAddress + ", cccd=" + cccd + ", gender=" + gender + ", homeTown="
				+ homeTown + ", courses=" + courses + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(birthDate, cccd, courses, currentAddress, firstName, gender, homeTown, id, lastName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(birthDate, other.birthDate) && Objects.equals(cccd, other.cccd)
				&& Objects.equals(courses, other.courses) && Objects.equals(currentAddress, other.currentAddress)
				&& Objects.equals(firstName, other.firstName) && gender == other.gender
				&& Objects.equals(homeTown, other.homeTown) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName);
	}



	public enum Gender {
        MALE, FEMALE, OTHER
    }
}
