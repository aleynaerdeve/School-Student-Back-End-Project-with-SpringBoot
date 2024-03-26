package com.aleyna.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
import java.sql.SQLOutput;
import java.util.Collections;
*/

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class);




		/*var app=new SpringApplication(ExampleApplication.class);
		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active", "dev"));
		var ctx=app.run(args); *//*SET THE ACTIVE PROFILES PROGRAMMATICALLY*/


		// ilk kod var ctx= SpringApplication.run(ExampleApplication.class, args);

		/*MyFirstService myFirstService=ctx.getBean(MyFirstService.class); //Bean naming
		System.out.println(myFirstService.tellAStory());*/

		//System.out.println(myFirstService.getJavaVersion());
		//System.out.println(myFirstService.getOsName());
		//System.out.println(myFirstService.readProperty());

		/*System.out.println(myFirstService.getGetCustomPropertyFromAnotherFile());
		System.out.println(myFirstService.getCustomPropertyFromAnotherFile2()); READING FROM FILES*/

	/*	System.out.println(myFirstService.getCustomProperty());
		System.out.println(myFirstService.getCustomPropertyInt());
	*/






	}

	/*@Bean
	public MyFirstClass myFirstClass(){
		return new MyFirstClass();
	}*/

}
