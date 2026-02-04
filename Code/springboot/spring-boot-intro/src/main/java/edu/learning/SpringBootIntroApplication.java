package edu.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootIntroApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootIntroApplication.class, args);
	}

}
