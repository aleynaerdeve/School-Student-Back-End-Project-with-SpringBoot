/*
package com.aleyna.example;
//Spring can only scan appplicationproperties file

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
@Configuration
@Profile("dev") //class seviyesinde olduğu için hepsi dev profile olur
public class ApplicationConfig {
   	@Bean("bean1")//("myBean") //Bean naming
	//@Profile("dev") /// profile göre bean atama met ot
	//@Qualifier("bean2")

	public MyFirstClass myFirstBean(){
		return new MyFirstClass("First Bean");
	}
	@Bean//("myBean") //Bean naming
	//@Profile("test")
	//@Qualifier("bean2")
	public MyFirstClass mySecondBean(){
		return new MyFirstClass("Second Bean");
	}

	@Bean//("myBean") //Bean naming

	//@Primary //higher priority
	//@Qualifier("bean2")
	public MyFirstClass myThirdBean(){
		return new MyFirstClass("Third Bean");
	}

}
*/
