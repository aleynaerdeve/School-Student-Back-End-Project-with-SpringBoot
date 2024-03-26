package com.aleyna.example.student;

/*
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {


    private StudentMapper  mapper; //nerede kullanılacağını declare et

    @BeforeEach
    void setUp() {
        mapper=new StudentMapper();
    }


    @Test
    public void shouldMapStudentDtoToStudent(){

        StudentDto dto= new StudentDto("John", "Doe", "john@gmail.com", 1);

        Student student= mapper.toStudent(dto);

        assertEquals(dto.firstname(), student.getFirstname());
        assertEquals(dto.lastname(), student.getLastname());
        assertEquals(dto.email(), student.getEmail());
        assertNotNull(student.getSchool());
        assertEquals(dto.schoolId(), student.getSchool().getId());

    }


    @Test
    public void should_throw_null_pointer_exception_when_studentDto_is_nulll(){
         var exp= assertThrows(NullPointerException.class, () -> mapper.toStudent(null));
         assertEquals("The student Dto should not be null", exp.getMessage());


/*      assertEquals("", student.getFirstname());
        assertEquals("", student.getLastname());*/

    }

    @Test
    public void shouldMapStudentToStudentResponseDto(){
        // Given
        Student student = new Student("Jane","Smith", "jane@email.com",20 );
        //When
        StudentResponseDto response = mapper.toStudentResponseDto(student);

        //Then
        assertEquals(response.firstname(), student.getFirstname());
        assertEquals(response.lastname(), student.getLastname());
        assertEquals(response.email(), student.getEmail());


    }















    //***********************************
///EXAMPLES
  /*  @BeforeAll
    static void beforeAll() {
        System.out.println("Inside before all method");

    }

    @AfterAll
    static void afterAll() {
        System.out.println("Inside after all method");

    }

    @BeforeEach
    void setUp() {
        System.out.println("Inside before each method");

    }

    @AfterEach
    void tearDown() {
        System.out.println("Inside after each method");

    }

    @Test
    public void  testMethod1(){ ///test 0 parametres
        System.out.println("My first test method");
    }

    @Test
    public void testMethod2(){ ///test 0 parametres
        System.out.println("My second test method");
    }*/

}