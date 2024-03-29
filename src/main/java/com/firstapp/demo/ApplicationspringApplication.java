package com.firstapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RestController
public class ApplicationspringApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationspringApplication.class, args);
	}
@RequestMapping("/hello")
	public String sayMootez(){
		return"Hello  mootez in  spring boot ";
}


}
