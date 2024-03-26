package com.aleyna.example.student;

import com.aleyna.example.school.School;
import com.aleyna.example.studentprofile.StudentProfile;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "T_STUDENT") //tablo adını değiştirebilirsin
public class Student {
    @Id
    @GeneratedValue()// only with primary keys
    private Integer id;
    @Column(name = " c_fname", length = 20) // column adını değiştirebilrisin
    private String firstname;
    private String lastname;
    @Column(unique = true) //email unique olsun
    private String email;
    private int age;
    @OneToOne( mappedBy = "student", cascade = CascadeType.ALL) // one student can only have one profile

    /*mappedby: reference field in student
    * cascade: öğrenci silindiğinde otomatik olarak profil de siinir
    *
    *
    * */
    private StudentProfile studentProfile;

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @ManyToOne // many students can study at one school
    @JoinColumn(name = "school_id")

    @JsonBackReference
    private School school;



 /*   @Column(updatable = false) // EX: Creation date updateable olmasın
    private String some_column;*/

    public Student() {
    }

    public Student(String firstname, String lastname, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
