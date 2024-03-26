package com.aleyna.example.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> { // Student entity için jpa reposu, Int: type of unique id

///HIBERNATE QUERY metot olmadığı için buraya tanımladık
    List<Student> findAllByFirstnameContaining(String p); // p:parametre




}
