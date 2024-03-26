package com.aleyna.example.student;

//import org.springframework.http.HttpStatus;
//import jakarta.persistence.Id;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
//import org.springframework.web.bind.annotation.ResponseStatus;


@RestController // class level controller anotasyonu
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    ////Service layera gitti
/*    private final StudentRepository repository;
    private final StudentMapper studentMapper;*/

    /*public StudentController(StudentRepository repository, StudentMapper studentMapper) {
        this.repository = repository;
        this.studentMapper = studentMapper;
    }*/

    @PostMapping("/students")
    public StudentResponseDto saveStudent( @Valid @RequestBody StudentDto dto) { //RestClienttan StudentDto göndermesi istenir

    return this.studentService.saveStudent(dto);
    }
        /*var student=studentMapper.toStudent(dto);
        var savedStudent = repository.save(student);
        return studentMapper.toStudentResponseDto(savedStudent);*/


    //**************
    //StudentDto objenin student a dönüşmesi
/*    private Student toStudent(StudentDto dto){
        var student= new Student();
        student.setFirstname(dto.firstname());
        student.setLastname(dto.lastname());
        student.setEmail(dto.email());

        var school= new School();
        school.setId(dto.schoolId());

        student.setSchool(school);

        return student;
    }
    private StudentResponseDto toStudentResponseDto(Student student){
        return new StudentResponseDto(student.getFirstname(), student.getLastname(), student.getEmail());
    }*/
    //--------------



    //----------------------------------
    ///DB DEKİ TÜM ÖĞRENCİLERİ GÖSTERME
/*    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return repository.findAll();
    }*/

    //RETRIEVE DATA ID YE GORE
    //------------------------
/*    @GetMapping("/students")
    public List<Student> findAllStudent(){
        return repository.findAllStudent();
    } sS*/
    @GetMapping("/students")
    public List<StudentResponseDto> findAllStudent(){
        return studentService.findAllStudent();
    }
    @GetMapping("/students/{student-id}") //pathvariable
    public StudentResponseDto findStudentById(@PathVariable("student-id") Integer id){
        return studentService.findStudentById(id); //orElse(new Student()); //Retrieve data id ye göre
    }
    @GetMapping("/students/search/{student-name}") //pathvariable
    public List<StudentResponseDto> findStudentsByName(@PathVariable("student-name") String name){
        return studentService.findStudentsByName(name); //Retrieve data id ye göre
    }
    ///DETELING BY STUDENT ID
    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete( @PathVariable("student-id") Integer id){
        studentService.delete(id);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?>handleMethodArgumentNotValidException(
            MethodArgumentNotValidException exp
    ){
        var errors=new HashMap<String, String>();
        exp.getBindingResult().getAllErrors()
                .forEach(error ->{
                    var fieldName= ((FieldError) error).getField();
                    var errorMessage=error.getDefaultMessage();
                    errors.put(fieldName,errorMessage);
                });

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

//+-----------

   /* @GetMapping("/hello")
    public String sayHello(){
        return "Hello from my first controller";
    }*/

   /* @PostMapping("/post") // Browser does not support PostRequests --sent into  the body of a http request
    public String post(
           @RequestBody String message //body of our request used in spring mvc
    ){
        return "Request Accepted and message is : "+ message;
    }*/
    /*
@RequestMapping, Spring Framework ile web uygulamaları geliştirirken HTTP isteklerini belirli
bir yönteme eşleştirmek için kullanılan çok yönlü bir anotasyondur.
Özel amaçlı anotasyonları getmapping postmapping
*/


    //annotated method should handle http request of a certain type : post,get,put

   /* @PostMapping("/post-order") // Browser does not support PostRequests --sent into  the body of a http request
    public String post(
            @RequestBody Order order //body of our request used in spring mvc
    ){
        return "Request Accepted and order is : "+ order.toString();
    }
    @PostMapping("/post-order-record") // Browser does not support PostRequests --sent into  the body of a http request
    public String postRecord(
            @RequestBody OrderRecord order //body of our request used in spring mvc
    ){
        return "Request Accepted and order is : "+ order.toString();
    }*/

  /*    //http://localhost:8080/hello/aleyna

    @GetMapping("/hello/{user-name}")
    public String pathVar( @PathVariable("user-name") String userName){
        return "My value = " + userName;
    }*/

    //http://localhost:8080/hello?param_name=paramvalue&paramname_2=value_2

/*    @GetMapping("/hello")
    public String paramVar( @RequestParam("user-name") String userName,
                             @RequestParam("user-lastname") String userLastName

    ){
        return "My value = " + userName +"   " + userLastName;
    }*/


 /*   @GetMapping("/hello-2")
    @ResponseStatus(HttpStatus.ACCEPTED) //specify response status
    public String sayHello2(){
        return "Hello 2 from my first controller";
    }*/

}
