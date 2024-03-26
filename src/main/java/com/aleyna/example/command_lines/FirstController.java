/*
package com.aleyna.example;

//import org.springframework.http.HttpStatus;
//import jakarta.persistence.Id;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import org.springframework.web.bind.annotation.ResponseStatus;


@RestController // class level controller anotasyonu
public class FirstController {
    private final StudentRepository repository;

    public FirstController(StudentRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/students")
    public Student post( @RequestBody Student student){
        return repository.save(student);
    }
    //----------------------------------
    ///DB DEKİ TÜM ÖĞRENCİLERİ GÖSTERME
*/
/*    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return repository.findAll();
    }*//*


    //RETRIEVE DATA ID YE GORE
   //--------------------------
    @GetMapping("/students")
    public List<Student> findAllStudent(){
        return repository.findAll();
    }
    @GetMapping("/students/{student-id}") //pathvariable
    public Student findStudentById(@PathVariable("student-id") Integer id){
        return repository.findById(id).orElse(new Student()); //Retrieve data id ye göre
    }
    @GetMapping("/students/search/{student-name}") //pathvariable
    public List<Student> findStudentsByName(@PathVariable("student-name") String name){
        return repository.findAllByFirstnameContaining(name); //Retrieve data id ye göre
    }
    ///DETELING BY STUDENT ID
    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete( @PathVariable("student-id") Integer id){
        repository.deleteById(id);
    }



//+-----------

   */
/* @GetMapping("/hello")
    public String sayHello(){
        return "Hello from my first controller";
    }*//*


   */
/* @PostMapping("/post") // Browser does not support PostRequests --sent into  the body of a http request
    public String post(
           @RequestBody String message //body of our request used in spring mvc
    ){
        return "Request Accepted and message is : "+ message;
    }*//*

    */
/*
@RequestMapping, Spring Framework ile web uygulamaları geliştirirken HTTP isteklerini belirli
bir yönteme eşleştirmek için kullanılan çok yönlü bir anotasyondur.
Özel amaçlı anotasyonları getmapping postmapping
*//*



    //annotated method should handle http request of a certain type : post,get,put

   */
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
    }*//*


  */
/*    //http://localhost:8080/hello/aleyna

    @GetMapping("/hello/{user-name}")
    public String pathVar( @PathVariable("user-name") String userName){
        return "My value = " + userName;
    }*//*


    //http://localhost:8080/hello?param_name=paramvalue&paramname_2=value_2

*/
/*    @GetMapping("/hello")
    public String paramVar( @RequestParam("user-name") String userName,
                             @RequestParam("user-lastname") String userLastName

    ){
        return "My value = " + userName +"   " + userLastName;
    }*//*



 */
/*   @GetMapping("/hello-2")
    @ResponseStatus(HttpStatus.ACCEPTED) //specify response status
    public String sayHello2(){
        return "Hello 2 from my first controller";
    }*//*


}
*/
