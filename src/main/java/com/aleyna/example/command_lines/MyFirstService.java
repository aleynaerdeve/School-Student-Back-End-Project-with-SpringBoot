/*
package com.aleyna.example;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;
@Service
//@PropertySource("classpath:custom.properties") //read from another file (ONE FILE)
@PropertySources({@PropertySource("classpath:custom.properties"),
@PropertySource("classpath:custom-file-2.properties") //INJECT MULTIPLE PROPERTY SOURCES
})
public class MyFirstService {
   */
/* @Autowired //EKLENİNCE FIELD INJECTION
    @Qualifier("mySecondBean") // Primary yerine geçiyor.*//*


    private final MyFirstClass myFirstClass;
    @Value("${my.custom.property}")     // value from application,properties file into a variable
    private String customProperty;
    @Value("${my.custom.property.int}")     // value from application,properties file into a variable
    private Integer customPropertyInt;





  */
/*  @Value("Hello Aleyna students")
    private String customProperty;
    @Value("${my.prop}")
    private String customPropertyFromAnotherFile;
    @Value("${my.prop.2}")

    private String customPropertyFromAnotherFile2;

    @Value("123")
    private Integer customPropertyInt; READ FROM ANOTHER FILE CODES
*//*


    public MyFirstService(@Qualifier("bean1") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }


    // private Environment environment; //information about the current environment in which application is running

  */
/*  @Autowired SETTER INJECTION
    public void setMyFirstClass(@Qualifier("mySecondBean") MyFirstClass myFirstClass){
        this.myFirstClass=myFirstClass;
    }*//*


   */
/* @Autowired //Dependency Injection
    public void injectDependencies(@Qualifier("bean1") MyFirstClass myFirstClass){
        this.myFirstClass= myFirstClass;
    }*//*


 */
/*   public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    } CONSTRUCTOR
*//*

    public String tellAStory(){
        return "the dependency is saying: :" + myFirstClass.sayHello();
    }

    public String getCustomProperty() {
        return customProperty;
    }

    public Integer getCustomPropertyInt() {
        return customPropertyInt;
    }

   */
/* public String getGetCustomPropertyFromAnotherFile() {
        return customPropertyFromAnotherFile;
    }

    public String getCustomPropertyFromAnotherFile2() {
        return customPropertyFromAnotherFile2; READ FROM ANOTHER FILES GETTERS
    }*//*



    //ENVIRONMENT BEAN KODLARI
*/
/*    public String getJavaVersion(){
        return environment.getProperty("java.version");
    }

    public String getOsName(){
        return environment.getProperty("os.name");
    }
    public String readProperty(){
        return environment.getProperty("my.custom.property");
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }*//*

}
*/
